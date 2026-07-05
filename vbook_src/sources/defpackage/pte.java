package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pte  reason: default package */
/* loaded from: classes.dex */
public final class pte implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public pte(a6f a6fVar, d8f d8fVar) {
        this.a = 2;
        this.c = d8fVar;
        Objects.requireNonNull(a6fVar);
        this.b = a6fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                mve mveVar = (mve) obj;
                mveVar.a.W();
                z9e z9eVar = mveVar.a.c;
                a6f.U(z9eVar);
                return z9eVar.U0((String) obj2);
            case 1:
                mve mveVar2 = (mve) obj;
                mveVar2.a.W();
                return new h9e(mveVar2.a.q0(((d8f) obj2).a));
            case 2:
                d8f d8fVar = (d8f) obj2;
                String str = d8fVar.a;
                am8.s(str);
                a6f a6fVar = (a6f) obj;
                hwe a = a6fVar.a(str);
                dwe dweVar = dwe.ANALYTICS_STORAGE;
                if (a.i(dweVar) && hwe.c(100, d8fVar.O).i(dweVar)) {
                    return a6fVar.d0(d8fVar).F();
                }
                a6fVar.c().J.e("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                q7f q7fVar = (q7f) obj2;
                v7f v7fVar = (v7f) obj;
                a0f a0fVar = q7fVar.a;
                rwa rwaVar = new rwa(29, false);
                try {
                    Uri uri = q7fVar.b;
                    bbf bbfVar = new bbf(v7fVar);
                    bbfVar.c = new rwa[]{rwaVar};
                    Void r2 = (Void) ((b9f) a0fVar.f.get()).a(uri, bbfVar);
                } catch (IOException | RuntimeException e) {
                    dce.G(Level.WARNING, a0fVar.a(), e, "Failed to update snapshot for %s flags may be stale.", q7fVar.c);
                }
                return null;
        }
    }

    public /* synthetic */ pte(q7f q7fVar, v7f v7fVar) {
        this.a = 3;
        this.c = q7fVar;
        this.b = v7fVar;
    }

    public /* synthetic */ pte(mve mveVar, Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = mveVar;
    }
}
