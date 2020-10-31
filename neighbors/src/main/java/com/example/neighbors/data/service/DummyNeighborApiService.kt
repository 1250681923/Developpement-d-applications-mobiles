package com.example.neighbors.data.service

import com.example.neighbors.models.Neighbor

class DummyNeighborApiService : NeighborApiService {

    override val neighbours: List<Neighbor>
        get() = DUMMY_NeighborS

    override fun deleteNeighbour(neighbor: Neighbor) {
        DUMMY_NeighborS.remove(neighbor)
    }

    override fun createNeighbour(neighbor: Neighbor) {
        DUMMY_NeighborS.add(neighbor)
    }

    override fun updateFavoriteStatus(neighbor: Neighbor) {
        TODO("Not yet implemented")
    }

    override fun updateDataNeighbour(neighbor: Neighbor) {
        TODO("Not yet implemented")
    }


    private val DUMMY_NeighborS: MutableList<Neighbor> = mutableListOf(
        Neighbor(
            1, "Caroline",
            "https://i.picsum.photos/id/1011/5472/3648.jpg?hmac=Koo9845x2akkVzVFX3xxAc9BCkeGYA9VRVfLE4f0Zzk",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 86 57 90 14",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Pellentesque porttitor id sem ut blandit. Lorem ipsum dolor sit amet, " +
                    "consectetur adipiscing elit. Donec sed hendrerit ex. Cras a tempus risus. " +
                    "Aliquam egestas nulla non luctus blandit. Aenean dignissim massa ultrices volutpat bibendum. " +
                    "Integer semper diam et lorem iaculis pulvinar.",
            true,
            "www.facebook.fr/caroline"
        ),
        Neighbor(
            2,
            "Jack",
            "https://i.picsum.photos/id/1012/3973/2639.jpg?hmac=s2eybz51lnKy2ZHkE2wsgc6S81fVD1W2NKYOSh8bzDc",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 00 55 90 14",
            ("Sed eget fringilla mauris, ac rutrum mauris. Curabitur finibus felis id justo porttitor, " +
                    "vitae hendrerit justo imperdiet. Donec tempus quam vulputate, elementum arcu a, molestie felis. " +
                    "Pellentesque eu risus luctus, tincidunt odio at, volutpat magna. Nam scelerisque vitae est vitae fermentum. " +
                    "Cras suscipit pretium ex, ut condimentum lorem sagittis sit amet. Praesent et gravida diam, at commodo lorem. " +
                    "Praesent tortor dui, fermentum vitae sollicitudin ut, elementum ut magna. Nulla volutpat tincidunt lectus, vel malesuada " +
                    "ante ultrices id.\n\n" +
                    "Ut scelerisque fringilla leo vitae dictum. Nunc suscipit urna tellus, a elementum eros accumsan vitae. " +
                    "Nunc lacinia turpis eu consectetur elementum. Cras scelerisque laoreet mauris ac pretium. Nam pellentesque " +
                    "ut orci ut scelerisque. Aliquam quis metus egestas, viverra neque vel, ornare velit. Nullam lobortis justo et ipsum " +
                    "sodales sodales. Etiam volutpat laoreet tellus, ultrices maximus nulla luctus ultricies. Praesent a dapibus arcu. In at magna " +
                    "in velit placerat vehicula nec in purus."),
            true,
            "www.facebook.fr/jack"
        ),
        Neighbor(
            3,
            "Chloé",
            "https://i.picsum.photos/id/1027/2848/4272.jpg?hmac=EAR-f6uEqI1iZJjB6-NzoZTnmaX0oI0th3z8Y78UpKM",
            "Saint-Pierre-du-Mont ; 6km",
            "+33 6 86 13 12 14",
            "Sed ultricies suscipit semper. Fusce non blandit quam. ",
            false,
            "www.facebook.fr/chloe"
        ),
        Neighbor(
            4,
            "Vincent",
            "https://i.picsum.photos/id/22/4434/3729.jpg?hmac=fjZdkSMZJNFgsoDh8Qo5zdA_nSGUAWvKLyyqmEt2xs0",
            "Saint-Pierre-du-Mont ; 11km",
            "+33 6 10 57 90 19",
            ("Etiam quis neque egestas, consectetur est quis, laoreet augue. " +
                    "Interdum et malesuada fames ac ante ipsum primis in faucibus. Morbi ipsum sem, " +
                    "commodo in nisi maximus, semper dignissim metus. Fusce eget nunc sollicitudin, dignissim " +
                    "tortor quis, consectetur mauris. "),
            true,
            "www.facebook.fr/vincent"
        ),
        Neighbor(
            5,
            "Elodie",
            "https://i.picsum.photos/id/399/2048/1365.jpg?hmac=Tm7jwbWj0i70u952g5yC0da-gxScdY2mQ6gjKrP8Haw",
            "Saint-Pierre-du-Mont ; 8km",
            "+33 6 86 57 90 14",
            ("Fusce in ligula mi. Aliquam in sagittis tellus. Suspendisse tempor, velit et " +
                    "cursus facilisis, eros sapien sollicitudin mauris, et ultrices " +
                    "lectus sapien in neque. "),
            true,
            "www.facebook.fr/elodie"
        ),
        Neighbor(
            6,
            "Sylvain",
            "https://i.picsum.photos/id/375/5184/3456.jpg?hmac=3OUWWnSmq1CUXU7cmTnctSvhQYvyME_osftkbJynX04",
            "Saint-Pierre-du-Mont ; 6km",
            "+33 6 86 12 22 02",
            ("Integer pulvinar lacinia augue, a tempor ex semper eget. Nam lacinia " +
                    "lorem dapibus, pharetra ante in, auctor urna. Praesent sollicitudin metus sit " +
                    "amet nunc lobortis sodales. In eget ante congue, vestibulum leo ac, placerat leo. " +
                    "Nullam arcu purus, cursus a sollicitudin eu, lobortis vitae est. Sed sodales sit " +
                    "amet magna nec finibus. Nulla pellentesque, justo ut bibendum mollis, urna diam " +
                    "hendrerit dolor, non gravida urna quam id eros. "),
            false,
            "www.facebook.fr/sylvain"
        ),
        Neighbor(
            7,
            "Laetitia",
            "https://i.picsum.photos/id/628/2509/1673.jpg?hmac=TUdtbj7l4rQx5WGHuFiV_9ArjkAkt6w2Zx8zz-aFwwY",
            "Saint-Pierre-du-Mont ; 14km",
            "+33 6 96 57 90 01",
            "Vestibulum non leo vel mi ultrices pellentesque. ",
            true,
            "www.facebook.fr/laetitia"
        ),
        Neighbor(
            8,
            "Dan",
            "https://i.picsum.photos/id/453/2048/1365.jpg?hmac=A8uxtdn4Y600Z5b2ngnn9hCXAx8sUnOVzprtDnz6DK8",
            "Saint-Pierre-du-Mont ; 1km",
            "+33 6 86 57 90 14",
            "Cras non dapibus arcu. ",
            true,
            "www.facebook.fr/dan"
        ),
        Neighbor(
            9,
            "Joseph",
            "https://i.picsum.photos/id/473/5616/3744.jpg?hmac=4tP7GutJ3LGRXeprD581uaNnJJGrhF57f08OOtMm1q0",
            "Saint-Pierre-du-Mont ; 2km",
            "+33 6 86 57 90 14",
            ("Donec neque odio, eleifend a luctus ac, tempor non libero. " +
                    "Nunc ullamcorper, erat non viverra feugiat, massa odio facilisis ligula, " +
                    "ut pharetra risus libero eget elit. Nulla malesuada, purus eu malesuada malesuada, est " +
                    "purus ullamcorper ipsum, quis congue velit mi sed lorem."),
            false,
            "www.facebook.fr/joseph"
        ),
        Neighbor(
            10,
            "Emma",
            "https://i.picsum.photos/id/64/4326/2884.jpg?hmac=9_SzX666YRpR_fOyYStXpfSiJ_edO3ghlSRnH2w09Kg",
            "Saint-Pierre-du-Mont ; 1km",
            "+33 6 14 71 70 18",
            ("Aliquam erat volutpat. Mauris at massa nibh. Suspendisse auctor fermentum orci, " +
                    "nec auctor tortor. Ut eleifend euismod turpis vitae tempus. Sed a tincidunt ex. Etiam ut " +
                    "nibh ante. Fusce maximus lorem nibh, at sollicitudin ante ultrices vel. Praesent ac luctus ante, eu " +
                    "lacinia diam. Quisque malesuada vel arcu vitae euismod. Ut egestas mattis euismod.\n\n" +
                    "Vestibulum non leo vel mi ultrices pellentesque. Praesent ornare ligula " +
                    "non elit consectetur, pellentesque fringilla eros placerat. Etiam consequat dui " +
                    "eleifend justo iaculis, ac ullamcorper velit consectetur. Aliquam vitae elit ac ante ultricies aliquet " +
                    "vel at felis. Suspendisse ac placerat odio. Cras non dapibus arcu. Fusce pharetra nisi at orci rhoncus, " +
                    "vitae tristique nibh euismod."),
            false,
            "www.facebook.fr/emma"
        ),
        Neighbor(
            11,
            "Patrick",
            "https://i.picsum.photos/id/91/3504/2336.jpg?hmac=tK6z7RReLgUlCuf4flDKeg57o6CUAbgklgLsGL0UowU",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 20 40 60 80",
            ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce porttitor molestie " +
                    "libero, nec porta lectus posuere a. Curabitur in purus at enim commodo accumsan. Nullam molestie diam a massa finibus, in bibendum " +
                    "nulla ullamcorper. Nunc at enim enim. Maecenas quis posuere nisi. Mauris suscipit cursus velit id condimentum. Ut finibus turpis " +
                    "at nulla finibus sollicitudin. Nunc dolor mauris, blandit id ullamcorper vel, lacinia ac nisi. Vestibulum et sapien tempor, " +
                    "egestas lorem vitae, faucibus urna. Duis id odio massa. Class aptent taciti sociosqu ad litora torquent per conubia nostra, " +
                    "per inceptos himenaeos.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce porttitor molestie  " +
                    "libero, nec porta lectus posuere a. Curabitur in purus at enim commodo accumsan. Nullam molestie diam a massa finibus, in bibendum " +
                    "nulla ullamcorper. Nunc at enim enim. Maecenas quis posuere nisi. Mauris suscipit cursus velit id condimentum. Ut finibus turpis " +
                    "at nulla finibus sollicitudin. Nunc dolor mauris, blandit id ullamcorper vel, lacinia ac nisi. Vestibulum et sapien tempor, " +
                    "egestas lorem vitae, faucibus urna. Duis id odio massa. Class aptent taciti sociosqu ad litora torquent per conubia nostra, " +
                    "per inceptos himenaeos."),
            true,
            "www.facebook.fr/patrick"
        ),
        Neighbor(
            12,
            "Ludovic",
            "https://i.picsum.photos/id/804/6000/3376.jpg?hmac=AZ4VZdij0jPu8BKZRbiE2lEMJGGjSFv43ii3RHRugco",
            "Saint-Pierre-du-Mont ; 5km",
            "+33 6 00 01 10 11",
            ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce porttitor molestie " +
                    "libero, nec porta lectus posuere a. Curabitur in purus at enim commodo accumsan. Nullam molestie diam a massa finibus, in bibendum " +
                    "nulla ullamcorper. Nunc at enim enim. Maecenas quis posuere nisi. Mauris suscipit cursus velit id condimentum. Ut finibus turpis " +
                    "at nulla finibus sollicitudin. Nunc dolor mauris, blandit id ullamcorper vel, lacinia ac nisi. Vestibulum et sapien tempor, " +
                    "egestas lorem vitae, faucibus urna. Duis id odio massa. Class aptent taciti sociosqu ad litora torquent per conubia nostra, " +
                    "per inceptos himenaeos.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce porttitor molestie  " +
                    "libero, nec porta lectus posuere a. Curabitur in purus at enim commodo accumsan. Nullam molestie diam a massa finibus, in bibendum " +
                    "nulla ullamcorper. Nunc at enim enim. Maecenas quis posuere nisi. Mauris suscipit cursus velit id condimentum. Ut finibus turpis " +
                    "at nulla finibus sollicitudin. Nunc dolor mauris, blandit id ullamcorper vel, lacinia ac nisi. Vestibulum et sapien tempor, " +
                    "egestas lorem vitae, faucibus urna. Duis id odio massa. Class aptent taciti sociosqu ad litora torquent per conubia nostra, " +
                    "per inceptos himenaeos."),
            false,
            "www.facebook.fr/ludovic"
        )
    )


}