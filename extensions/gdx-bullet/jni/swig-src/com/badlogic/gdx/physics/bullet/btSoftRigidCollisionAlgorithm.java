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

public class btSoftRigidCollisionAlgorithm extends btCollisionAlgorithm {
	private long swigCPtr;
	
	protected btSoftRigidCollisionAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btSoftRigidCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btSoftRigidCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
		this("btSoftRigidCollisionAlgorithm", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btSoftRigidCollisionAlgorithm obj) {
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
				gdxBulletJNI.delete_btSoftRigidCollisionAlgorithm(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btSoftRigidCollisionAlgorithm(btPersistentManifold mf, btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper col0, btCollisionObjectWrapper col1Wrap, boolean isSwapped) {
    this(gdxBulletJNI.new_btSoftRigidCollisionAlgorithm(btPersistentManifold.getCPtr(mf), mf, btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, btCollisionObjectWrapper.getCPtr(col0), col0, btCollisionObjectWrapper.getCPtr(col1Wrap), col1Wrap, isSwapped), true);
  }

}
