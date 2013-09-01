/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btDefaultCollisionConstructionInfo extends BulletBase {
	private long swigCPtr;
	
	protected btDefaultCollisionConstructionInfo(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btDefaultCollisionConstructionInfo(long cPtr, boolean cMemoryOwn) {
		this("btDefaultCollisionConstructionInfo", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btDefaultCollisionConstructionInfo obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btDefaultCollisionConstructionInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setStackAlloc(btStackAlloc value) {
    gdxBulletJNI.btDefaultCollisionConstructionInfo_stackAlloc_set(swigCPtr, this, btStackAlloc.getCPtr(value), value);
  }

  public btStackAlloc getStackAlloc() {
    long cPtr = gdxBulletJNI.btDefaultCollisionConstructionInfo_stackAlloc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btStackAlloc(cPtr, false);
  }

  public void setPersistentManifoldPool(btPoolAllocator value) {
    gdxBulletJNI.btDefaultCollisionConstructionInfo_persistentManifoldPool_set(swigCPtr, this, btPoolAllocator.getCPtr(value), value);
  }

  public btPoolAllocator getPersistentManifoldPool() {
    long cPtr = gdxBulletJNI.btDefaultCollisionConstructionInfo_persistentManifoldPool_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public void setCollisionAlgorithmPool(btPoolAllocator value) {
    gdxBulletJNI.btDefaultCollisionConstructionInfo_collisionAlgorithmPool_set(swigCPtr, this, btPoolAllocator.getCPtr(value), value);
  }

  public btPoolAllocator getCollisionAlgorithmPool() {
    long cPtr = gdxBulletJNI.btDefaultCollisionConstructionInfo_collisionAlgorithmPool_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public void setDefaultMaxPersistentManifoldPoolSize(int value) {
    gdxBulletJNI.btDefaultCollisionConstructionInfo_defaultMaxPersistentManifoldPoolSize_set(swigCPtr, this, value);
  }

  public int getDefaultMaxPersistentManifoldPoolSize() {
    return gdxBulletJNI.btDefaultCollisionConstructionInfo_defaultMaxPersistentManifoldPoolSize_get(swigCPtr, this);
  }

  public void setDefaultMaxCollisionAlgorithmPoolSize(int value) {
    gdxBulletJNI.btDefaultCollisionConstructionInfo_defaultMaxCollisionAlgorithmPoolSize_set(swigCPtr, this, value);
  }

  public int getDefaultMaxCollisionAlgorithmPoolSize() {
    return gdxBulletJNI.btDefaultCollisionConstructionInfo_defaultMaxCollisionAlgorithmPoolSize_get(swigCPtr, this);
  }

  public void setCustomCollisionAlgorithmMaxElementSize(int value) {
    gdxBulletJNI.btDefaultCollisionConstructionInfo_customCollisionAlgorithmMaxElementSize_set(swigCPtr, this, value);
  }

  public int getCustomCollisionAlgorithmMaxElementSize() {
    return gdxBulletJNI.btDefaultCollisionConstructionInfo_customCollisionAlgorithmMaxElementSize_get(swigCPtr, this);
  }

  public void setDefaultStackAllocatorSize(int value) {
    gdxBulletJNI.btDefaultCollisionConstructionInfo_defaultStackAllocatorSize_set(swigCPtr, this, value);
  }

  public int getDefaultStackAllocatorSize() {
    return gdxBulletJNI.btDefaultCollisionConstructionInfo_defaultStackAllocatorSize_get(swigCPtr, this);
  }

  public void setUseEpaPenetrationAlgorithm(int value) {
    gdxBulletJNI.btDefaultCollisionConstructionInfo_useEpaPenetrationAlgorithm_set(swigCPtr, this, value);
  }

  public int getUseEpaPenetrationAlgorithm() {
    return gdxBulletJNI.btDefaultCollisionConstructionInfo_useEpaPenetrationAlgorithm_get(swigCPtr, this);
  }

  public btDefaultCollisionConstructionInfo() {
    this(gdxBulletJNI.new_btDefaultCollisionConstructionInfo(), true);
  }

}
