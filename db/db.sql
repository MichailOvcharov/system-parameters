-- Единица измерения массы
create table UNIT_OF_MEASURE (
                                  id serial,
                                  name varchar(100)
);
insert into unit_of_measure (name) values ('грамм');
insert into unit_of_measure (name) values ('килограмм');
insert into unit_of_measure (name) values ('центнер');
insert into unit_of_measure (name) values ('карат');
insert into unit_of_measure (name) values ('тонна');
-- Валюты
create table CURRENCY (
                          id serial,
                          name varchar(100)
);
insert into CURRENCY (name) values ('рубль');
insert into CURRENCY (name) values ('доллар');
insert into CURRENCY (name) values ('евро');
insert into CURRENCY (name) values ('фунт');
insert into CURRENCY (name) values ('юань');
-- Тип цены
create table PRICING_TYPE (
                              id serial,
                              name varchar(100)
);
insert into PRICING_TYPE (name) values ('закупочная');
insert into PRICING_TYPE (name) values ('оптовая ');
insert into PRICING_TYPE (name) values ('мелкооптовая');
insert into PRICING_TYPE (name) values ('розничная');
--  ставка НДС
create table VAL_TYPE (
                          id serial,
                          name varchar(100)
);
insert into VAL_TYPE (name) values ('0 %');
insert into VAL_TYPE (name) values ('10 %');
insert into VAL_TYPE (name) values ('20 %');
-- тип контракта
create table DEAL_TYPE (
                           id serial,
                           name varchar(100)
);
insert into DEAL_TYPE (name) values ('с фиксированной ценой');
insert into DEAL_TYPE (name) values ('издержки плюс прибыль');
insert into DEAL_TYPE (name) values ('с разделением затрат');
insert into DEAL_TYPE (name) values ('блочный контракт');
-- таблица свойств
create table PROPERTY_TYPE (
                               id serial,
                               name varchar(100),
                               TAG varchar(100),
                               GIST varchar(50),
                               required boolean,
                               pattern varchar(100),
                               input_type varchar(100),
                               create_by date,
                               create_date date,
                               last_modified_by date,
                               last_modified_by_date date
);
--
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('isAutomatic', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('dealType', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('unitOfMesure', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('currency', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('pricingType', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('valType', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('jewerlyType', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('packaging', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('stoneInsert', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('chemicalАnalysis', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('marking', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('combinedTool', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('urgency', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);

insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('special', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('imennik', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('assaywork', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('chemical', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('marking', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
insert into PROPERTY_TYPE (name, TAG, GIST, required, pattern, input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('statecontrol', 'PARAM_SYSTEM', 'FPP',true, '*', 'input', '2021-01-01', now(), null, null);
--- Тип изделия
create table JEWERLY_TYPE (
                              id serial,
                              name varchar(100)
);
---
insert into JEWERLY_TYPE (name) values ('серьги');
insert into JEWERLY_TYPE (name) values ('цепочки');
insert into JEWERLY_TYPE (name) values ('бусы');
insert into JEWERLY_TYPE (name) values ('браслеты');
insert into JEWERLY_TYPE (name) values ('кольца');
insert into JEWERLY_TYPE (name) values ('колье');
insert into JEWERLY_TYPE (name) values ('медальоны');
insert into JEWERLY_TYPE (name) values ('броши');
---
--- контрагент
create table CONTRACTOR (
                            id serial,
                            name varchar(100),
                            isFPP boolean
);
---
insert into CONTRACTOR (name, isFPP) values ('Кострома', false);
insert into CONTRACTOR (name, isFPP) values ('Верхневолжское МРУ', true);
--- свойства контрагента
create table CONTRACTOR_PROPERTY (
id serial,
value varchar(100),
begin_date date,
end_date date,
property_type_id bigint,
contractor_id bigint,
input_type varchar(100),
create_by date,
create_date date,
last_modified_by date,
last_modified_by_date date
);

insert into CONTRACTOR_PROPERTY (value, begin_date, end_date, property_type_id, contractor_id,
input_type, create_by, create_date, last_modified_by, last_modified_by_date)
values ('AUTOMATIC', null, null, 1, 1, 'input', null, null, null, null);
