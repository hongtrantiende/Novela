package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eh0  reason: default package */
/* loaded from: classes.dex */
public abstract class eh0 implements y50 {
    public v50 b;
    public v50 c;
    public v50 d;
    public v50 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public eh0() {
        ByteBuffer byteBuffer = y50.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        v50 v50Var = v50.e;
        this.d = v50Var;
        this.e = v50Var;
        this.b = v50Var;
        this.c = v50Var;
    }

    public abstract v50 a(v50 v50Var);

    @Override // defpackage.y50
    public boolean c() {
        if (this.h && this.g == y50.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y50
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = y50.a;
        return byteBuffer;
    }

    @Override // defpackage.y50
    public final void e(w50 w50Var) {
        this.g = y50.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        b();
    }

    @Override // defpackage.y50
    public final v50 g(v50 v50Var) {
        this.d = v50Var;
        this.e = a(v50Var);
        if (isActive()) {
            return this.e;
        }
        return v50.e;
    }

    @Override // defpackage.y50
    public final void h() {
        this.h = true;
        j();
    }

    @Override // defpackage.y50
    public boolean isActive() {
        if (this.e != v50.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.y50
    public final void reset() {
        ByteBuffer byteBuffer = y50.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        v50 v50Var = v50.e;
        this.d = v50Var;
        this.e = v50Var;
        this.b = v50Var;
        this.c = v50Var;
        k();
    }

    public void b() {
    }

    public void j() {
    }

    public void k() {
    }
}
