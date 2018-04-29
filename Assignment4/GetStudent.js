var AWS = require('aws-sdk');


exports.handler = function(event, context, callback) {

    var docClient = new AWS.DynamoDB.DocumentClient()
    console.log("Check if student has already enrolled in course.");
    
    var params = {
        TableName : 'Student',
        Key:{
            'StudentName' : event.StudentName
        }
    };
    docClient.put(params, function(err, data) {
         if (err) {
            console.log("Student has already registry");
            event.enroll = "false";
        } else {
             console.log("Registry now");
            event.enroll = "true";
        }
    });
    callback(null, event);
}
