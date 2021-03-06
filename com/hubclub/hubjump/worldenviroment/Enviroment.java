package com.hubclub.Hubjump.worldenviroment;

import java.util.LinkedList;
import java.util.Queue;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.hubclub.Hubjump.characters.Ninja;
import com.hubclub.Hubjump.characters.NinjaContactListener;
import com.hubclub.Hubjump.characters.WallSegment;

public class Enviroment {
	private final static float GRAVITATIONAL_ACCELERATION = -10f;
	public final static float VP_WIDTH = 12;
	public final static float VP_HEIGHT = 20;
	public final static byte NUMBER_OF_BLOCKS = 3;
	
	protected World world;
	private Ninja ninja;
	protected  Queue<WallSegment> segments;
	
	public Enviroment (){
		this.world =(new World(new Vector2(0, GRAVITATIONAL_ACCELERATION), true));
			ninja = new Ninja();
			ninja.setBody(world, 3f, 6.8f);
		world.setContactListener(new NinjaContactListener(ninja));
		
		segments = new LinkedList<WallSegment>();
		generateFirstSegments();
	
	}
	
	private void generateFirstSegments(){
		segments.add(new WallSegment());
		segments.peek().generateFirstSegment(world);
		
		for (int i=0 ; i<NUMBER_OF_BLOCKS-1 ; i++){
			WallSegment wll = new WallSegment();
			wll.generateNextSegment(world);
			segments.add(wll);
		}
		
	}
	
	public void moveQueue () {
		world.destroyBody(segments.poll().getWallsegment());
		
		WallSegment wll = new WallSegment();
			wll.generateNextSegment(world);
			segments.add(wll);
		System.out.println("wallsegment added!");
	}
	
	public void update (){
		
		
		
		ninja.update();
		getWorld().step(Gdx.graphics.getDeltaTime(), 6, 2);
	}

	public World getWorld() {
		return world;
	}

}
