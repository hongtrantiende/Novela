package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kdd  reason: default package */
/* loaded from: classes.dex */
public final class kdd extends mdd {
    public static kdd c;
    public static final pq8 d = new pq8(7);
    public final Application b;

    public kdd(Application application) {
        this.b = application;
    }

    @Override // defpackage.mdd, defpackage.ldd
    public final gdd a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        xk5.q("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.mdd, defpackage.ldd
    public final gdd b(Class cls, ru7 ru7Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) ru7Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!mp.class.isAssignableFrom(cls)) {
            return sxd.h(cls);
        }
        vs.m("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final gdd d(Class cls, Application application) {
        if (mp.class.isAssignableFrom(cls)) {
            try {
                gdd gddVar = (gdd) cls.getConstructor(Application.class).newInstance(application);
                gddVar.getClass();
                return gddVar;
            } catch (IllegalAccessException e) {
                cp8.o("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                cp8.o("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                cp8.o("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                cp8.o("Cannot create an instance of ", cls, e4);
                return null;
            }
        }
        return sxd.h(cls);
    }
}
