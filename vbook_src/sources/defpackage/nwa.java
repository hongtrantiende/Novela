package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nwa  reason: default package */
/* loaded from: classes.dex */
public final class nwa extends GLSurfaceView {
    public SurfaceTexture C;
    public Surface D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final if8 d;
    public final Handler e;
    public final zz9 f;

    public nwa(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        zz9 zz9Var = new zz9();
        this.f = zz9Var;
        mwa mwaVar = new mwa(this, zz9Var);
        View.OnTouchListener qicVar = new qic(context, mwaVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new if8(windowManager.getDefaultDisplay(), qicVar, mwaVar);
        this.E = true;
        setEGLContextClientVersion(2);
        setRenderer(mwaVar);
        setOnTouchListener(qicVar);
    }

    public final void a() {
        boolean z;
        if (this.E && this.F) {
            z = true;
        } else {
            z = false;
        }
        Sensor sensor = this.c;
        if (sensor != null && z != this.G) {
            if8 if8Var = this.d;
            SensorManager sensorManager = this.b;
            if (z) {
                sensorManager.registerListener(if8Var, sensor, 0);
            } else {
                sensorManager.unregisterListener(if8Var);
            }
            this.G = z;
        }
    }

    public v51 getCameraMotionListener() {
        return this.f;
    }

    public o8d getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.D;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new e09(this, 6));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.F = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.F = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.G = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.E = z;
        a();
    }
}
