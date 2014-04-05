var notiifcation = { 
    createNotification: function(){
    
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'NotificationManager', // mapped to our native Java class called "Calendar"
            'addNotification', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "title": title,
                "description": notes,
                "eventLocation": location,
                "startTimeMillis": startDate.getTime(),
                "endTimeMillis": endDate.getTime()
            }]
        );
    }
}
module.exports = notiifcation;