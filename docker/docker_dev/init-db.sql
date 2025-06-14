DO $$
    BEGIN
        IF NOT EXISTS (SELECT 1 FROM information_schema.schemata WHERE schema_name = 'anacarde') THEN
            CREATE SCHEMA anacarde;
        END IF;
    END $$;
DO $$
    BEGIN
        IF NOT EXISTS (SELECT 1 FROM information_schema.schemata WHERE schema_name = 'keycloak') THEN
            CREATE SCHEMA keycloak;
        END IF;
    END $$;
