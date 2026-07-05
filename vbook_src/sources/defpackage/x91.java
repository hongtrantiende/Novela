package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x91  reason: default package */
/* loaded from: classes.dex */
public final class x91 {
    public int a;
    public long b;
    public Object c;

    public x91(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }

    public synchronized boolean a() {
        boolean z;
        if (this.a != 0) {
            ((c2d) this.c).a.getClass();
            if (System.currentTimeMillis() <= this.b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public synchronized void b(int i) {
        long min;
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            this.a++;
            synchronized (this) {
                if (i != 429 && (i < 500 || i >= 600)) {
                    min = 86400000;
                    ((c2d) this.c).a.getClass();
                    this.b = System.currentTimeMillis() + min;
                }
                double pow = Math.pow(2.0d, this.a);
                ((c2d) this.c).getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
                ((c2d) this.c).a.getClass();
                this.b = System.currentTimeMillis() + min;
            }
            return;
        }
        synchronized (this) {
            this.a = 0;
        }
    }
}
