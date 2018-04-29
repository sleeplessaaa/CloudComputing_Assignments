var AWS = require('aws-sdk');
var ses = new AWS.SES({region: 'us-west-2'});
var docClient = new AWS.DynamoDB.DocumentClient({region: "us-west-2"});

exports.handler = (event, context, callback) => {
    // TODO implement
    callback(null, "Bill of student - " + event.StudentName + ' :' + event.Fee);
    var emailAddress = "chenlixiang.jlu@gmail.com"
    
    var prof = {
        TableName: "Professor",
        Key:{
            "Course" : event.Course
        }
    };
    docClient.get(prof, function(err, data) {
        if (err) {
            console.error("Unable to read item. Error JSON:", JSON.stringify(err, null, 2));
        } else {
            console.log("GetItem succeeded:", JSON.stringify(data, null, 2));
            var email = data.Item.Email;

            var toProf = {
                Destination: {
                    ToAddresses: [email]
                },
                Message: {
                    Body: {
                        Text: {
                            Data: "Dear " + data.Item.ProfName
                                + "\n\nA student successfully registered for your Course " + event.Course,
                        }
                    },
                    Subject: {
                        Data: "Successful Registration"
                    }
                },
                Source: emailAddress
            };

            var emailToProf = ses.sendEmail(toProf, function(err, data){
                if(err) {
                    console.log(err);
                } else {
                    console.log("Email sent to professor");
                    console.log(data);
                }
            });
        }
    });
};
