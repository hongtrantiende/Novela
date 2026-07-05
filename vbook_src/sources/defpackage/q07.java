package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q07  reason: default package */
/* loaded from: classes3.dex */
public abstract class q07 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public q07() {
        if (fn8.c == null) {
            fn8.c = new fn8(7);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((r07) this.d).D == this.c) {
            return;
        }
        vs.f();
    }

    public void c() {
        while (true) {
            int i = this.a;
            r07 r07Var = (r07) this.d;
            if (i < r07Var.f && r07Var.c[i] < 0) {
                this.a = i + 1;
            } else {
                return;
            }
        }
    }

    public boolean hasNext() {
        if (this.a < ((r07) this.d).f) {
            return true;
        }
        return false;
    }

    public void remove() {
        r07 r07Var = (r07) this.d;
        b();
        if (this.b != -1) {
            r07Var.c();
            r07Var.k(this.b);
            this.b = -1;
            this.c = r07Var.D;
            return;
        }
        vs.k("Call next() before removing element from the iterator.");
    }
}
