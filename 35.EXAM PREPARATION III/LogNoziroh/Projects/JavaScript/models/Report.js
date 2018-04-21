const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Task = sequelize.define("Report", {
        status: {
            type:Sequelize.ENUM,
            values:["Normal",'Warning', 'Critical']
        },
        message: Sequelize.TEXT,
        origin: Sequelize.TEXT
    }, {
        timestamps: false
    });

    return Task;
};