package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kqa  reason: default package */
/* loaded from: classes.dex */
public final class kqa implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ kqa(o2e o2eVar) {
        this.a = 1;
        Objects.requireNonNull(o2eVar);
        this.e = o2eVar;
        this.b = -1;
    }

    public Iterator a() {
        if (this.d == null) {
            this.d = ((iqa) this.e).b.entrySet().iterator();
        }
        return this.d;
    }

    public Iterator b() {
        if (this.d == null) {
            this.d = ((o2e) this.e).c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                iqa iqaVar = (iqa) abstractMap;
                if (this.b + 1 < iqaVar.a.size()) {
                    return true;
                }
                if (!iqaVar.b.isEmpty() && a().hasNext()) {
                    return true;
                }
                return false;
            default:
                o2e o2eVar = (o2e) abstractMap;
                if (this.b + 1 < o2eVar.b) {
                    return true;
                }
                if (!o2eVar.c.isEmpty() && b().hasNext()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                iqa iqaVar = (iqa) abstractMap;
                if (i2 < iqaVar.a.size()) {
                    return (Map.Entry) iqaVar.a.get(this.b);
                }
                return (Map.Entry) a().next();
            default:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                o2e o2eVar = (o2e) abstractMap;
                if (i3 < o2eVar.b) {
                    return (p2e) o2eVar.a[i3];
                }
                return (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                iqa iqaVar = (iqa) abstractMap;
                if (this.c) {
                    this.c = false;
                    int i2 = iqa.f;
                    iqaVar.b();
                    if (this.b < iqaVar.a.size()) {
                        int i3 = this.b;
                        this.b = i3 - 1;
                        iqaVar.h(i3);
                        return;
                    }
                    a().remove();
                    return;
                }
                vs.k("remove() was called before next()");
                return;
            default:
                if (this.c) {
                    this.c = false;
                    o2e o2eVar = (o2e) abstractMap;
                    o2eVar.f();
                    int i4 = this.b;
                    if (i4 < o2eVar.b) {
                        this.b = i4 - 1;
                        o2eVar.d(i4);
                        return;
                    }
                    b().remove();
                    return;
                }
                vs.k("remove() was called before next()");
                return;
        }
    }

    public kqa(iqa iqaVar) {
        this.a = 0;
        this.e = iqaVar;
        this.b = -1;
    }
}
