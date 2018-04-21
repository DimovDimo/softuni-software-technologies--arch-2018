const Report = require('../models').Report;

module.exports = {
    index: (req, res) => {
        Report
            .findAll()
            .then(reporters => res.render('report/index', {'reports':reporters}));
    },
    createGet: (req, res) => {
        res.render('report/create');
    },
    createPost: (req, res) => {
        let args = req.body;
        Report.create(args).then(() => res.redirect('/'));
    },
    detailsGet: (req, res) => {
        let id = req.params.id;
        Report.findById(id).then(reports => res.render('report/details', reports.dataValues));
    },
    deleteGet: (req, res) => {
        let id = req.params.id;
        Report.findById(id).then(report=>
            res.render('report/delete', report.dataValues)
        );
    },
    deletePost: (req, res) => {
        let id = req.params.id;
        Report.findById(id).then(project=>{
            project.destroy().then(()=>{
                res.redirect('/');
            })
        })
    }
};