CREATE TABLE IF NOT EXISTS orders (
    id SERIAL PRIMARY KEY NOT NULL ,
    order_id INTEGER NOT NULL ,
    dish_id INTEGER NOT NULL ,
    order_time TIMESTAMP DEFAULT now()
);

COMMENT ON TABLE orders IS 'Заказы';
COMMENT ON COLUMN orders.id IS 'Идентификатор таблицы';
COMMENT ON COLUMN orders.order_id IS 'Идентификатор заказа';
COMMENT ON COLUMN orders.dish_id IS 'Идентификатор заказанного блюда';
COMMENT ON COLUMN orders.order_time IS 'Время поступления заказа';
