<?php

namespace SoftUniBlogBundle\Controller;

use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use SoftUniBlogBundle\Entity\Article;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Symfony\Component\HttpFoundation\Response;

class HomeController extends Controller
{
    /**
     * @Route("/", name="blog_index")
     * @return Response
     */
    public function indexAction()
    {
        $articles = $this->getDoctrine() ->getRepository(Article::class) ->findAll();
        return $this->render('blog/index.html.twig', ['articles' => $articles]);
    }
}
