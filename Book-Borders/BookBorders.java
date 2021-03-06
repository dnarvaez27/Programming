import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
* 24-04-16
* @author dnarvaez27
**/
public class BookBorders
{
	public static ArrayList<Integer> toInteger( String[ ] lines )
	{
		ArrayList<Integer> nums = new ArrayList<>( );
		for( String l : lines )
		{
			nums.add( l.length( ) );
		}
		return nums;
	}
    
	public static void leadingLines( ArrayList<String> lines )
	{
		int contador = 0;
		for( String s : lines )
		{
			contador += s.indexOf( "." ) + 1;
		}
		contador--;
		System.out.println( /* "=" + */contador );
	}
	
	public static void main( String[ ] args )
	{
		try( BufferedReader bf = new BufferedReader( new InputStreamReader( System.in ) ) )
		{
			String libro = bf.readLine( );

			while( libro != null )
			{
				String[ ] lims = bf.readLine( ).split( " " );
				
				Long ini = System.currentTimeMillis( );
				
				int a = Integer.parseInt( lims[ 0 ] );
				int b = Integer.parseInt( lims[ 1 ] );
				String[ ] lineas = libro.split( " " );
				ArrayList<Integer> nums = BookBorders.toInteger( lineas );

				for( int l = a; l <= b; l++ )
				{
					ArrayList<String> rta = new ArrayList<>( );
					String test = "";
					int size = 0;

					for( int i = 0; i < nums.size( ); i++ )
					{
						int nuevo = nums.get( i );
						boolean added = false;

						if( size + nuevo <= l )
						{
							size += nuevo;
							test += lineas[ i ];
							if( size < l )
							{
								size += 1;
								test += ".";
								added = true;
							}
						}
						else
						{
							size = 0;
							rta.add( test );
							test = "";
						}
						if( !added )
						{
							if( size + nuevo <= l )
							{
								size += nuevo;
								test += lineas[ i ];
								if( size < l )
								{
									size += 1;
									test += ".";
								}
							}
						}
						if( i == nums.size( ) - 1 )
						{
							size = 0;
							rta.add( test );
							test = "";
						}
					}
					BookBorders.leadingLines( rta );
				}
				Long end = System.currentTimeMillis( );
				System.out.println( "Time: " + ( end - ini ) + " ms" );
				libro = bf.readLine( );
			}
		}
		catch( Exception e )
		{

		}
	}
}
