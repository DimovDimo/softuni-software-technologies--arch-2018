const Sequelize = require('sequelize');

module.exports = function(sequelize){
    const Product = sequelize.define('Product', {
        priority: {
            type: Sequelize.INTEGER,
            allowNull: false,
            required: true
        },
        name: {
            type: Sequelize.TEXT,
            allowNull: false,
            required: true
        },
        quantity: {
            type: Sequelize.INTEGER,
            allowNull: false,
            required: true
        },
        status: {
            type: Sequelize.TEXT,
            allowNull: false,
            required: true
        }
    },{
        timestamps:false
    });

    return Product;
};