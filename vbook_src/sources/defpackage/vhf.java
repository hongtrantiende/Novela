package defpackage;

import java.util.Iterator;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vhf  reason: default package */
/* loaded from: classes.dex */
public final class vhf implements Iterator {
    public fif a;
    public fif b;
    public int c;
    public final /* synthetic */ iif d;
    public final /* synthetic */ int e;

    public vhf(iif iifVar, int i) {
        this.e = i;
        Objects.requireNonNull(iifVar);
        this.d = iifVar;
        this.a = iifVar.f.d;
        this.b = null;
        this.c = iifVar.e;
    }

    /* renamed from: b */
    public final fif a() {
        fif fifVar = this.a;
        iif iifVar = this.d;
        if (fifVar != iifVar.f) {
            if (iifVar.e == this.c) {
                this.a = fifVar.d;
                this.b = fifVar;
                return fifVar;
            }
            vs.f();
            return null;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a != this.d.f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return a().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        fif fifVar = this.b;
        if (fifVar != null) {
            iif iifVar = this.d;
            iifVar.b(fifVar, true);
            this.b = null;
            this.c = iifVar.e;
            return;
        }
        vm1.d();
    }
}
