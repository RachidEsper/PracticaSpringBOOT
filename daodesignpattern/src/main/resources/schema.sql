DROP Table if exists "books";
Drop Table if exists "authors";

Create TABLE "authors" (
  "id" bigint GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    "name" text,
    "age" integer
);

create Table "books" (
  "isbn" text NOT NULL,
    "title" text,
    "author_id" bigint,
    CONSTRAINT "books_pkey" PRIMARY KEY ("isbn"),
    CONSTRAINT "fk_author" FOREIGN KEY ("author_id") REFERENCES "authors" ("id")
);