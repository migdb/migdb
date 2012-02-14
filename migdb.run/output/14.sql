UPDATE public.tableB AS target SET new_column = 
							(SELECT number FROM public.tableA AS source WHERE target.id = source.id );
