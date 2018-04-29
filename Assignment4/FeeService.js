var AWS = require("aws-sdk");
exports.handler = (event, context, callback) => {
     AWS.config.update({
      region: "us-west-2"
    });
    
    const docClient = new AWS.DynamoDB.DocumentClient();
    const params = {
        TableName: 'Course',
        Key: {
            'Course': event.Course
        }
    }
    
    docClient.get(params, function(err, data) {
        if(err){
            console.log("error to get course fee");
        }else{
            const course = data.Item;
            event.Fee = course.Fee;
        }
    });
    callback(null, event);
};
