package defpackage;

import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gg  reason: default package */
/* loaded from: classes.dex */
public final class gg extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg(rg rgVar, int i) {
        super(0);
        this.a = i;
        this.b = rgVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        kp kpVar;
        Method method;
        int i = 0;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) this.b.K.getValue();
                bool.getClass();
                return bool;
            case 1:
                qp androidViewsHandler = this.b.getAndroidViewsHandler();
                if (androidViewsHandler != null) {
                    int childCount = androidViewsHandler.getChildCount();
                    while (i < childCount) {
                        View childAt = androidViewsHandler.getChildAt(i);
                        if (childAt instanceof kp) {
                            kpVar = (kp) childAt;
                        } else {
                            kpVar = null;
                        }
                        if (kpVar != null && kpVar.isLayoutRequested()) {
                            kpVar.layout(kpVar.getLeft(), kpVar.getTop(), kpVar.getRight(), kpVar.getBottom());
                        }
                        i++;
                    }
                }
                return pvc.a;
            case 2:
                pv6 c = pv6.c(this.b.getConfiguration().getLocales());
                if (c.a.a.isEmpty()) {
                    c = pv6.b();
                }
                int size = c.a.a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Locale a = c.a(i);
                    a.getClass();
                    arrayList.add(new nv6(a));
                    i++;
                }
                return new ov6(arrayList);
            case 3:
                abf abfVar = rg.e1;
                rg rgVar = this.b;
                if (Build.VERSION.SDK_INT > 28 && rgVar.isAttachedToWindow()) {
                    if (rg.j1 == null) {
                        jb jbVar = new jb(1);
                        rg.j1 = jbVar;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (rg.f1 == null) {
                                rg.f1 = Class.forName("android.os.SystemProperties");
                            }
                            if (rg.h1 == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = rg.f1;
                                if (cls != null) {
                                    method = cls.getDeclaredMethod("addChangeCallback", Runnable.class);
                                } else {
                                    method = null;
                                }
                                rg.h1 = method;
                            }
                            Method method2 = rg.h1;
                            if (method2 != null) {
                                method2.invoke(null, jbVar);
                            }
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    kv7 kv7Var = rg.i1;
                    synchronized (kv7Var) {
                        kv7Var.a(rgVar);
                    }
                }
                return pvc.a;
            default:
                rg rgVar2 = this.b;
                MotionEvent motionEvent = rgVar2.I0;
                if (motionEvent != null) {
                    boolean contains = tl1.B(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = rgVar2.I0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (contains && i != 0) {
                        rgVar2.J0 = SystemClock.uptimeMillis();
                        rgVar2.post(rgVar2.Q0);
                    }
                }
                rgVar2.W0.invoke();
                return pvc.a;
        }
    }
}
