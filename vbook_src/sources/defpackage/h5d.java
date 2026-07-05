package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h5d  reason: default package */
/* loaded from: classes.dex */
public abstract class h5d {
    public final yz a;
    public final yz b;
    public final yz c;

    public h5d(yz yzVar, yz yzVar2, yz yzVar3) {
        this.a = yzVar;
        this.b = yzVar2;
        this.c = yzVar3;
    }

    public abstract i5d a();

    public final Class b(Class cls) {
        String name = cls.getName();
        yz yzVar = this.c;
        Class cls2 = (Class) yzVar.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(rs8.l(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
            yzVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        yz yzVar = this.a;
        Method method = (Method) yzVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, h5d.class.getClassLoader()).getDeclaredMethod("read", h5d.class);
            yzVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        yz yzVar = this.b;
        Method method = (Method) yzVar.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, h5d.class);
            yzVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        if (!e(i2)) {
            return i;
        }
        return ((i5d) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((i5d) this).e.readParcelable(i5d.class.getClassLoader());
    }

    public final j5d h() {
        String readString = ((i5d) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (j5d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            cp8.p("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            cp8.p("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            cp8.p("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                cp8.p("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((i5d) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((i5d) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(j5d j5dVar) {
        if (j5dVar == null) {
            ((i5d) this).e.writeString(null);
            return;
        }
        try {
            ((i5d) this).e.writeString(b(j5dVar.getClass()).getName());
            i5d a = a();
            try {
                d(j5dVar.getClass()).invoke(null, j5dVar, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                cp8.p("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                cp8.p("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                cp8.p("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    cp8.p("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            cp8.p(j5dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
