package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ifa  reason: default package */
/* loaded from: classes.dex */
public final class ifa {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public ifa() {
        d(nae.e, 270.0f, nae.e);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            efa efaVar = new efa(f4, f5, f4, f5);
            efaVar.f = this.d;
            efaVar.g = f3;
            this.g.add(new cfa(efaVar));
            this.d = f;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gfa) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ffa, gfa, java.lang.Object] */
    public final void c(float f, float f2) {
        ?? gfaVar = new gfa();
        gfaVar.b = f;
        gfaVar.c = f2;
        this.f.add(gfaVar);
        dfa dfaVar = new dfa(gfaVar, this.b, this.c);
        a(dfaVar.b() + 270.0f);
        this.g.add(dfaVar);
        this.d = dfaVar.b() + 270.0f;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = nae.e;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
