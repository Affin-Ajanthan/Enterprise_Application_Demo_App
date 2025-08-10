CREATE TABLE IF NOT EXISTS product_category (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT
    );

CREATE TABLE IF NOT EXISTS product (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    category_id VARCHAR(255),
    CONSTRAINT fk_product_category
    FOREIGN KEY (category_id)
    REFERENCES product_category(id)
    ON DELETE SET NULL
    );

CREATE TABLE IF NOT EXISTS product_price (
    id VARCHAR(255) PRIMARY KEY, -- same as product.id
    price DECIMAL(15, 2) NOT NULL,
    CONSTRAINT fk_product_price_product
    FOREIGN KEY (id)
    REFERENCES product(id)
    ON DELETE CASCADE
    );

CREATE TABLE IF NOT EXISTS item_level (
    id VARCHAR(255) PRIMARY KEY, -- same ID as product.id
    quantity DOUBLE PRECISION NOT NULL,
    CONSTRAINT fk_item_level_product
    FOREIGN KEY (id)
    REFERENCES product(id)
    ON DELETE CASCADE
    );