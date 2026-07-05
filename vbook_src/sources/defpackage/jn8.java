package defpackage;

import android.graphics.Path;
import android.graphics.PathIterator;
import androidx.graphics.path.ConicConverter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jn8  reason: default package */
/* loaded from: classes.dex */
public final class jn8 extends kn8 {
    public final PathIterator c;
    public final ConicConverter d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, androidx.graphics.path.ConicConverter] */
    public jn8(Path path, int i) {
        super(path, i);
        if (i != 0) {
            PathIterator pathIterator = path.getPathIterator();
            pathIterator.getClass();
            this.c = pathIterator;
            ?? obj = new Object();
            obj.c = new float[130];
            this.d = obj;
            return;
        }
        throw null;
    }

    @Override // defpackage.kn8
    public final boolean a() {
        return this.c.hasNext();
    }

    @Override // defpackage.kn8
    public final int b(float[] fArr) {
        int i;
        ConicConverter conicConverter = this.d;
        if (conicConverter.b < conicConverter.a) {
            conicConverter.b(fArr);
            return 3;
        }
        int next = this.c.next(fArr, 0);
        int[] iArr = ln8.a;
        switch (next) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                vs.m(a82.j(next, "Unknown path segment type "));
                return 0;
        }
        if (i == 4 && this.a == 2) {
            conicConverter.a(fArr[6], fArr);
            if (conicConverter.a > 0) {
                conicConverter.b(fArr);
            }
            return 3;
        }
        return i;
    }
}
