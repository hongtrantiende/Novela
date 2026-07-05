package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wme  reason: default package */
/* loaded from: classes.dex */
public final class wme {
    public static final Object f = new Object();
    public final String a;
    public final ace b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ wme(String str, Object obj, ace aceVar) {
        this.a = str;
        this.c = obj;
        this.b = aceVar;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (nae.l == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (jf8.b()) {
                    if (this.e == null) {
                        obj2 = this.c;
                    } else {
                        obj2 = this.e;
                    }
                    return obj2;
                }
                try {
                    for (wme wmeVar : yme.a) {
                        if (!jf8.b()) {
                            Object obj3 = null;
                            try {
                                ace aceVar = wmeVar.b;
                                if (aceVar != null) {
                                    obj3 = aceVar.mo5zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f) {
                                wmeVar.e = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                ace aceVar2 = this.b;
                if (aceVar2 != null) {
                    try {
                        return aceVar2.mo5zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } finally {
            }
        }
    }
}
