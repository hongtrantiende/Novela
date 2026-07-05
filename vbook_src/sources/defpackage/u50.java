package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u50  reason: default package */
/* loaded from: classes.dex */
public final class u50 {
    public final qs5 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public u50(qs5 qs5Var) {
        this.a = qs5Var;
        v50 v50Var = v50.e;
        this.d = false;
    }

    public final void a() {
        boolean z;
        w50 w50Var = w50.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j = w50Var.a;
        int i = 0;
        while (true) {
            qs5 qs5Var = this.a;
            if (i >= qs5Var.size()) {
                break;
            }
            y50 y50Var = (y50) qs5Var.get(i);
            y50Var.e(new w50(j));
            if (y50Var.isActive()) {
                j = y50Var.i(j);
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.D(z);
                arrayList.add(y50Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((y50) arrayList.get(i2)).d();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((y50) this.b.get(b())).c() && !this.c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        boolean z2;
        for (boolean z3 = true; z3; z3 = z) {
            z = false;
            for (int i = 0; i <= b(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    y50 y50Var = (y50) arrayList.get(i);
                    if (y50Var.c()) {
                        if (!this.c[i].hasRemaining() && i < b()) {
                            ((y50) arrayList.get(i + 1)).h();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = y50.a;
                        }
                        y50Var.f(byteBuffer2);
                        this.c[i] = y50Var.d();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z |= z2;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        qs5 qs5Var = ((u50) obj).a;
        qs5 qs5Var2 = this.a;
        if (qs5Var2.size() != qs5Var.size()) {
            return false;
        }
        for (int i = 0; i < qs5Var2.size(); i++) {
            if (qs5Var2.get(i) != qs5Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
