package io.tmiroljub.mobile.android.socialmediacompose.data

import io.tmiroljub.mobile.android.socialmediacompose.data.model.*

const val category1 = "egestas"
const val category2 = "nunc"
const val category3 = "eget"
const val category4 = "risus"
const val category5 = "nulla"
const val category6 = "mauris"
const val category7 = "convallis"
const val category8 = "vestibulum"
const val category9 = "odio"
const val category10 = "orci"
const val category11 = "ornare"
const val category12 = "diam"
const val category13 = "sit"
const val category14 = "nullam"
const val category15 = "purus"
const val category16 = "arcu"
const val category17 = "in"
const val category18 = "amet"
const val category19 = "neque"
const val category20 = "quam"

val categories1 = listOf(category1, category8, category15, category10)
val categories2 = listOf(category1, category11, category14)
val categories3 = listOf(category2, category6, category7, category8, category4)
val categories4 = listOf(category10, category15, category20, category13)
val categories5 = listOf(category18, category16, category12, category9)
val categories6 = listOf(category17, category19, category3, category5, category8)

val favorites = listOf(
    Favorite(
        id = 0,
        name = "Julia Fournier",
        picture = "https://images.unsplash.com/photo-1515515332716-78b07ef2afc0",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
        photo = "https://randomuser.me/api/portraits/women/45.jpg"
    ),
    Favorite(
        id = 1,
        name = "Byron Elliott",
        picture = "https://images.unsplash.com/photo-1533559363785-60ce822d02f1",
        description = "In ipsum dolorem At saepe earum quo culpa provident ex itaque nihil. Aut eveniet repudiandae qui rerum sunt ab dicta enim.",
        photo = "https://randomuser.me/api/portraits/men/53.jpg"
    ),
    Favorite(
        id = 2,
        name = "Eleuteria Barros",
        picture = "https://images.unsplash.com/photo-1562014920-d7a505a41dd8",
        description = "Eum rerum natus qui internos quam id quisquam fugiat ex perferendis maxime aut nulla quaerat sit officia praesentium",
        photo = "https://randomuser.me/api/portraits/women/43.jpg"
    ),
    Favorite(
        id = 3,
        name = "Luca King",
        picture = "https://images.unsplash.com/photo-1614913501059-9fb836fe1769",
        description = "Non quas harum sit ducimus iure ut necessitatibus dolorum quo excepturi maiores vel eveniet excepturi ut obcaecati debitis",
        photo = "https://randomuser.me/api/portraits/men/22.jpg"
    ),
    Favorite(
        id = 4,
        name = "Rosemarie Perrin",
        picture = "https://images.unsplash.com/photo-1614823498916-a28a7d67182c",
        description = "Eum Quis corporis sit magnam enim ut beatae autem aut placeat animi qui nihil esse.",
        photo = "https://randomuser.me/api/portraits/women/82.jpg"
    ),
    Favorite(
        id = 5,
        name = "Esther Renard",
        picture = "https://images.unsplash.com/photo-1549200683-70091948ef03",
        description = "Nam rerum consequatur et suscipit asperiores qui voluptates omnis et doloremque voluptatum aut rerum impedit sit dolor atque.",
        photo = "https://randomuser.me/api/portraits/women/63.jpg"
    )
)

val owner1 = Owner(
    "1", "heinz-georg.fiedler@example.com",
    "mr", "https://randomuser.me/api/portraits/men/81.jpg",
    "Fiedler", "Heinz-Georg"
)
val owner2 = Owner(
    "2", "elisa.vincent@example.com",
    "miss", "https://randomuser.me/api/portraits/women/90.jpg",
    "Elise", "Vincent"
)

val owner3 = Owner(
    "3", "solange.meyer@example.com",
    "miss", "https://randomuser.me/api/portraits/women/45.jpg",
    "Solange", "Meyer"
)

val owner4 = Owner(
    "4", "solange.meyer@example.com",
    "miss", "https://randomuser.me/api/portraits/women/75.jpg",
    "Emma", "Lawson"
)

val owner5 = Owner(
    "5", "sandro.henry@example.com",
    "mr", "https://randomuser.me/api/portraits/men/36.jpg",
    "Sandro", "Henry"
)

val owner6 = Owner(
    "6", "zackary.johnson@example.com",
    "mr", "https://randomuser.me/api/portraits/men/94.jpg",
    "Zackary", "Johnson"
)

val posts = listOf(
    Post(
        "1",
        "https://images.unsplash.com/photo-1595239541400-63a8eb5b3c24",
        "1974-03-12",
        "Viverra aliquet",
        "Ullam et saepe reiciendis voluptatem adipisci sit amet autem assumenda provident rerum culpa quis hic commodi nesciunt rem tenetur doloremque ipsam iure quis sunt voluptatem rerum illo velit",
        categories1,
        10,
        11,
        owner1
    ),
    Post(
        "2",
        "https://images.unsplash.com/photo-1473116519190-356a1463fbcf",
        "1974-03-12",
        "Lacus laoreet",
        "Et licet quocumque oculos flexeris feminas adfatim multas spectare cirratas, quibus, si nupsissent, per aetatem ter iam nixus poterat suppetere liberorum, ad usque taedium pedibus pavimenta tergentes iactari volucriter gyris, dum exprimunt innumera simulacra, quae finxere fabulae theatrales.",
        categories2,
        22,
        8,
        owner2
    ),
    Post(
        "3",
        "https://images.unsplash.com/photo-1518469300936-8435c410a555",
        "1974-03-12",
        "Mauris augue",
        "Sed omnis veniam a deleniti dolor ut natus nesciunt! Qui explicabo culpa et eaque nemo et possimus nulla eos doloribus provident. Ut delectus praesentium qui dolores culpa id labore quia qui fugit obcaecati aut tenetur omnis",
        categories3,
        12,
        7,
        owner5
    ),
    Post(
        "4",
        "https://images.unsplash.com/photo-1535930891776-0c2dfb7fda1a",
        "1974-03",
        "Nam libero",
        "Et itaque ipsum hic deserunt nulla ab nostrum quos et sint neque. Eos blanditiis laborum ea consequatur veritatis hic quidem porro in omnis consequatur modi perspiciatis ut autem laboriosam et impedit atque",
        categories4,
        19,
        3,
        owner3
    ),
    Post(
        "5",
        "https://images.unsplash.com/photo-1473615695634-d284ec918736",
        "1974-03-12",
        "Augue interdum",
        "Ea molestiae voluptatem non necessitatibus laudantium et dolore voluptatem est fugiat laborum nam incidunt quasi. Non voluptas animi non velit dignissimos id nisi odio qui accusamus autem aut velit dolor.",
        categories5,
        33,
        7,
        owner6
    ),
    Post(
        "6",
        "https://images.unsplash.com/photo-1508710285745-edc8137d6b5b",
        "1974-03-12",
        "Faucibus turpis",
        "At quae magni non dignissimos expedita quos adipisci. Sed Quis excepturi aut consequuntur ipsam ut dolorem nulla eum quam perferendis et explicabo ipsa non quia deserunt.",
        categories6,
        9,
        5,
        owner4
    )
)

val photos = listOf(
    "https://images.pexels.com/photos/1119972/pexels-photo-1119972.jpeg",
    "https://images.pexels.com/photos/3649206/pexels-photo-3649206.jpeg",
    "https://images.pexels.com/photos/819764/pexels-photo-819764.jpeg",
    "https://images.pexels.com/photos/2389265/pexels-photo-2389265.jpeg",
    "https://images.pexels.com/photos/947168/pexels-photo-947168.jpeg",
    "https://images.pexels.com/photos/356624/pexels-photo-356624.jpeg",
    "https://images.pexels.com/photos/373246/pexels-photo-373246.jpeg",
    "https://images.pexels.com/photos/753639/pexels-photo-753639.jpeg",
    "https://images.pexels.com/photos/4179480/pexels-photo-4179480.jpeg",
    "https://images.pexels.com/photos/713456/pexels-photo-713456.jpeg",
    "https://images.pexels.com/photos/1119972/pexels-photo-1119972.jpeg",
    "https://images.pexels.com/photos/2031767/pexels-photo-2031767.jpeg",
    "https://images.pexels.com/photos/2198520/pexels-photo-2198520.jpeg",
    "https://images.pexels.com/photos/1446624/pexels-photo-1446624.jpeg",
    "https://images.pexels.com/photos/3727263/pexels-photo-3727263.jpeg",
    "https://images.pexels.com/photos/1006965/pexels-photo-1006965.jpeg",
    "https://images.pexels.com/photos/38238/maldives-ile-beach-sun-38238.jpeg",
    "https://images.pexels.com/photos/1438248/pexels-photo-1438248.jpeg",
    "https://images.pexels.com/photos/2915957/pexels-photo-2915957.jpeg",
    "https://images.pexels.com/photos/2495575/pexels-photo-2495575.jpeg",
    "https://images.pexels.com/photos/1397736/pexels-photo-1397736.jpeg",
    "https://images.pexels.com/photos/7218645/pexels-photo-7218645.jpeg"
)

val profile = Profile(
    "12323",
    "0700-3090279",
    "Fiedler",
    "Heinz-Georg",
    "heinz-georg.fiedler@example.com",
    "male",
    "mr",
    "https://images.unsplash.com/photo-1470076892663-af684e5e15af",
    "https://randomuser.me/api/portraits/men/81.jpg",
    "1974-03-12T21:15:08.878Z",
    photos,
    following = 123,
    followers = 342,
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam at varius diam. Vivamus dapibus ac mi ac mattis. Aliquam convallis pretium urna eu egestas. Cras semper ex justo, quis ultrices dui ullamcorper at. Quisque pulvinar a orci vitae ultrices. Nam sit amet sem elit. Donec massa elit, elementum ac malesuada non, consequat id ipsum. Nulla rutrum dolor sed euismod scelerisque. In eleifend nunc a lacinia efficitur. Phasellus molestie laoreet augue eu scelerisque. Nunc vel volutpat orci, vitae tincidunt neque. Ut egestas urna quis nibh tempus interdum. Etiam ultrices orci ac ipsum pharetra eleifend. Suspendisse vehicula purus leo, a luctus tellus blandit a."
)

val comments = listOf( Comments(
    "1",
    "😉😉😍😍 Pretty photo",
    "Édina",
    "Barbosa",
    "2020-05-19",
    "https://randomuser.me/api/portraits/women/28.jpg"
), Comments(
    "2",
    "😊👍👍 Awesome shot",
    "Çetiner",
    "Oya",
    "2020-04-12",
    "https://randomuser.me/api/portraits/women/66.jpg"
),Comments(
    "3",
    "😁😁☺️😌 Impressive image",
    "Vega",
    "Roberto",
    "2020-03-20",
    "https://randomuser.me/api/portraits/men/25.jpg"

), Comments(
    "4",
    "Cool pic",
    "André",
    "Robert",
    "2020-01-17",
    "https://randomuser.me/api/portraits/men/9.jpg"
), Comments(
    "5",
    "🤔 Beautiful post!!!",
    "Els",
    "Ijsseldijk",
    "2020-01-03",
    "https://randomuser.me/api/portraits/women/75.jpg"
), Comments(
    "6",
    "Perfect pic",
    "Vicente",
    "Margarita",
    "2019-12-27",
    "https://randomuser.me/api/portraits/women/5.jpg"
), Comments(
    "7",
    "😆😆😆😆 Cool shot",
    "Wilson",
    "Benjamin",
    "2019-12-04",
    "https://randomuser.me/api/portraits/men/14.jpg"
),Comments(
    "8",
    "🥰🥰🥰🥰 Cool image!",
    "Jan",
    "Siebert",
    "2020-04-18",
    "https://randomuser.me/api/portraits/men/60.jpg"
), Comments(
    "9",
    "Breathtaking pic!",
    "Lorenzo",
    "Elisa",
    "2020-03-10",
    "https://randomuser.me/api/portraits/women/89.jpg"
), Comments(
    "10",
    "Ideal photo",
    "Degner",
    "Eckard",
    "2020-02-21",
    "https://randomuser.me/api/portraits/men/41.jpg"
), Comments(
    "11",
    "😎😎😸😸 Cute image!",
    "Sigmund",
    "Myran",
    "2020-03-06",
    "https://randomuser.me/api/portraits/men/61.jpg",

    )
)

val stories = listOf(
    Storie("Ellen Tuomi", "redcat987", "https://randomuser.me/api/portraits/women/10.jpg"),
    Storie("Aaron Wang", "goldenbear929", "https://randomuser.me/api/portraits/men/60.jpg"),
    Storie("Ella King", "crazypanda568", "https://randomuser.me/api/portraits/women/11.jpg"),
    Storie("Corey Hill", "redcat796", "https://randomuser.me/api/portraits/men/90.jpg"),
    Storie("Jade Joly", "bluepeacock997", "https://randomuser.me/api/portraits/women/65.jpg"),
    Storie("Ivar Liefers", "tinygorilla952", "https://randomuser.me/api/portraits/men/85.jpg"),
    Storie("Izzie Fleming", "ticklishdog257", "https://randomuser.me/api/portraits/women/79.jpg"),
    Storie("Gabriel Harris", "whitefrog871", "https://randomuser.me/api/portraits/men/62.jpg"),
    Storie("Grace Wheeler", "lazyladybug562", "https://randomuser.me/api/portraits/women/27.jpg")
)