package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lza  reason: default package */
/* loaded from: classes.dex */
public final class lza implements Iterator, j76 {
    public final tra a;
    public final Iterator b;
    public Object c;
    public Object d;
    public int e;

    public lza(tra traVar, Iterator it) {
        Object obj;
        this.a = traVar;
        this.b = it;
        mza mzaVar = traVar.a;
        mzaVar.getClass();
        this.e = ((mza) dra.h(mzaVar)).d;
        this.c = this.d;
        if (it.hasNext()) {
            obj = it.next();
        } else {
            obj = null;
        }
        this.d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        mza mzaVar = this.a.a;
        mzaVar.getClass();
        if (((mza) dra.h(mzaVar)).d == this.e) {
            this.c = this.d;
            Iterator it = this.b;
            if (it.hasNext()) {
                obj = it.next();
            } else {
                obj = null;
            }
            this.d = obj;
            Object obj2 = this.c;
            if (obj2 != null) {
                return obj2;
            }
            vm1.d();
            return null;
        }
        vs.f();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        tra traVar = this.a;
        mza mzaVar = traVar.a;
        mzaVar.getClass();
        if (((mza) dra.h(mzaVar)).d == this.e) {
            Object obj = this.c;
            if (obj != null) {
                traVar.remove(obj);
                this.c = null;
                mza mzaVar2 = traVar.a;
                mzaVar2.getClass();
                this.e = ((mza) dra.h(mzaVar2)).d;
                return;
            }
            vm1.d();
            return;
        }
        vs.f();
    }
}
