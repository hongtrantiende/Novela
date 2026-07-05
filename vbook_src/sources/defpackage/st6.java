package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import androidx.graphics.path.PathIteratorPreApi34Impl;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: st6  reason: default package */
/* loaded from: classes.dex */
public final class st6 implements Iterator, j76 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public st6(au8 au8Var) {
        aoc[] aocVarArr = new aoc[8];
        for (int i = 0; i < 8; i++) {
            aocVarArr[i] = new coc(this);
        }
        this.b = new bu8(au8Var, aocVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((iy6) obj).c;
            case 1:
                return ((kn8) obj).a();
            case 2:
                return ((bu8) obj).c;
            default:
                return ((Iterator) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        float f;
        PointF[] pointFArr;
        PointF[] pointFArr2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lt6 lt6Var = nt6.Companion;
                long nextLong = ((iy6) obj).nextLong();
                lt6Var.getClass();
                return lt6.a(nextLong);
            case 1:
                kn8 kn8Var = (kn8) obj;
                float[] fArr = kn8Var.b;
                int b = kn8Var.b(fArr);
                if (b == 7) {
                    return no8.a;
                }
                if (b == 6) {
                    return no8.b;
                }
                if (b == 4) {
                    f = fArr[6];
                } else {
                    f = nae.e;
                }
                int C = a82.C(b);
                if (C == 0) {
                    pointFArr = new PointF[]{new PointF(fArr[0], fArr[1])};
                } else if (C == 1) {
                    pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])};
                } else if (C != 2 && C != 3) {
                    if (C != 4) {
                        pointFArr2 = new PointF[0];
                    } else {
                        pointFArr2 = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])};
                    }
                    return new ko8(b, pointFArr2, f);
                } else {
                    pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])};
                }
                pointFArr2 = pointFArr;
                return new ko8(b, pointFArr2, f);
            case 2:
                return (Map.Entry) ((bu8) obj).next();
            default:
                return (l4d) ((Iterator) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                ((bu8) this.b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public st6(Path path, int i) {
        if (i != 0) {
            this.b = Build.VERSION.SDK_INT >= 34 ? new jn8(path, i) : new PathIteratorPreApi34Impl(path, i);
            return;
        }
        throw null;
    }

    public st6(iy6 iy6Var) {
        this.b = iy6Var;
    }

    public st6(j4d j4dVar) {
        this.b = j4dVar.F.iterator();
    }
}
