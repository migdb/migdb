ALTER TABLE public.child 
				  	  ALTER COLUMN name TYPE int
						USING converting_chartoint(name)
						;