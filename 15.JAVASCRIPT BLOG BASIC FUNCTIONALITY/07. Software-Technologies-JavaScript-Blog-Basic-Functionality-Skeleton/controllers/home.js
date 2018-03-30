const Sequelize = require('sequelize');

module.exports = {
    index: (req, res) => {
        const Article = sequelize.define('Article', {
            title: {
                type: Sequelize.STRING,
                allowNull: false,
                required: true
            },
            content: {
                type: Sequelize.TEXT,
                allowNull: false,
                required: true
            },
            date: {
                type: Sequelize.DATE,
                allowNull: false,
                required: true,
                defaultValue: Sequelize.NOW,
            },
        });

        Article.findAll({limit: 6, include: [{
            model:User
        }]}).then(articles => {
            res.render('home/index', {articles: articles});
        });
    }
};




