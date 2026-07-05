package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gdd  reason: default package */
/* loaded from: classes.dex */
public abstract class gdd {
    public final hdd a = new hdd();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        hdd hddVar = this.a;
        if (hddVar != null) {
            if (hddVar.d) {
                hdd.a(autoCloseable);
                return;
            }
            synchronized (hddVar.a) {
                autoCloseable2 = (AutoCloseable) hddVar.b.put(str, autoCloseable);
            }
            hdd.a(autoCloseable2);
        }
    }

    public final void b() {
        hdd hddVar = this.a;
        if (hddVar != null && !hddVar.d) {
            hddVar.d = true;
            synchronized (hddVar.a) {
                try {
                    for (AutoCloseable autoCloseable : hddVar.b.values()) {
                        hdd.a(autoCloseable);
                    }
                    for (AutoCloseable autoCloseable2 : hddVar.c) {
                        hdd.a(autoCloseable2);
                    }
                    hddVar.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        hdd hddVar = this.a;
        if (hddVar != null) {
            synchronized (hddVar.a) {
                autoCloseable = (AutoCloseable) hddVar.b.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void d() {
    }
}
