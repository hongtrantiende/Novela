package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u67  reason: default package */
/* loaded from: classes.dex */
public final class u67 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public u67() {
        this.b = new ifa[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new ifa();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; i++) {
            ((ifa[]) this.b)[i] = new ifa();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public aac a(int i, ArrayList arrayList, ska skaVar) {
        ArrayList arrayList2 = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            this.k = skaVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                t67 t67Var = (t67) arrayList.get(i2 - i);
                if (i2 > 0) {
                    t67 t67Var2 = (t67) arrayList2.get(i2 - 1);
                    t67Var.d = t67Var2.a.o.b.o() + t67Var2.d;
                    t67Var.e = false;
                    t67Var.c.clear();
                } else {
                    t67Var.d = 0;
                    t67Var.e = false;
                    t67Var.c.clear();
                }
                int o = t67Var.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((t67) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, t67Var);
                ((HashMap) this.e).put(t67Var.b, t67Var);
                if (this.a) {
                    g(t67Var);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(t67Var);
                    } else {
                        s67 s67Var = (s67) ((HashMap) this.f).get(t67Var);
                        if (s67Var != null) {
                            s67Var.a.c(s67Var.b);
                        }
                    }
                }
            }
        }
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void b(xea xeaVar, float f, RectF rectF, mce mceVar, Path path) {
        int i;
        ?? r16;
        float f2;
        tn3 tn3Var;
        mce mceVar2;
        boolean z;
        y72 y72Var;
        nc2 nc2Var;
        mce mceVar3 = mceVar;
        Matrix[] matrixArr = (Matrix[]) this.d;
        float[] fArr = (float[]) this.i;
        ifa[] ifaVarArr = (ifa[]) this.b;
        Matrix[] matrixArr2 = (Matrix[]) this.c;
        path.rewind();
        Path path2 = (Path) this.f;
        path2.rewind();
        Path path3 = (Path) this.g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            r16 = 0;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.e;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        y72Var = xeaVar.f;
                    } else {
                        y72Var = xeaVar.e;
                    }
                } else {
                    y72Var = xeaVar.h;
                }
            } else {
                y72Var = xeaVar.g;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        nc2Var = xeaVar.b;
                    } else {
                        nc2Var = xeaVar.a;
                    }
                } else {
                    nc2Var = xeaVar.d;
                }
            } else {
                nc2Var = xeaVar.c;
            }
            ifa ifaVar = ifaVarArr[i2];
            nc2Var.getClass();
            Matrix[] matrixArr3 = matrixArr;
            nc2Var.g(ifaVar, f, y72Var.a(rectF));
            int i3 = i2 + 1;
            float f3 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            ifa ifaVar2 = ifaVarArr[i2];
            fArr[0] = ifaVar2.b;
            fArr[1] = ifaVar2.c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i2].preRotate(f3);
            i2 = i3;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            ifa ifaVar3 = ifaVarArr[i4];
            ifaVar3.getClass();
            fArr[r16] = 0.0f;
            fArr[1] = ifaVar3.a;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[r16], fArr[1]);
            } else {
                path.lineTo(fArr[r16], fArr[1]);
            }
            ifaVarArr[i4].b(matrixArr2[i4], path);
            if (mceVar3 != null) {
                ifa ifaVar4 = ifaVarArr[i4];
                Matrix matrix = matrixArr2[i4];
                d27 d27Var = (d27) mceVar3.a;
                BitSet bitSet = d27Var.d;
                ifaVar4.getClass();
                f2 = 0.0f;
                bitSet.set(i4, (boolean) r16);
                hfa[] hfaVarArr = d27Var.b;
                ifaVar4.a(ifaVar4.e);
                hfaVarArr[i4] = new bfa(new ArrayList(ifaVar4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            Path path4 = (Path) this.k;
            ifa ifaVar5 = (ifa) this.h;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            ifa ifaVar6 = ifaVarArr[i4];
            fArr[0] = ifaVar6.b;
            fArr[1] = ifaVar6.c;
            matrixArr2[i4].mapPoints(fArr);
            float[] fArr2 = (float[]) this.j;
            ifa ifaVar7 = ifaVarArr[i6];
            ifaVar7.getClass();
            fArr2[0] = f2;
            fArr2[1] = ifaVar7.a;
            matrixArr2[i6].mapPoints(fArr2);
            ifa[] ifaVarArr2 = ifaVarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            ifa ifaVar8 = ifaVarArr2[i4];
            fArr[0] = ifaVar8.b;
            fArr[1] = ifaVar8.c;
            matrixArr5[i4].mapPoints(fArr);
            if (i4 != 1 && i4 != 3) {
                Math.abs(rectF.centerY() - fArr[1]);
            } else {
                Math.abs(rectF.centerX() - fArr[0]);
            }
            ifaVar5.d(nae.e, 270.0f, nae.e);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        tn3Var = xeaVar.j;
                    } else {
                        tn3Var = xeaVar.i;
                    }
                } else {
                    tn3Var = xeaVar.l;
                }
            } else {
                tn3Var = xeaVar.k;
            }
            tn3Var.getClass();
            ifaVar5.c(max, nae.e);
            path4.reset();
            ifaVar5.b(matrixArr4[i4], path4);
            if (this.a && (f(path4, i4) || f(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = ifaVar5.a;
                matrixArr4[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                ifaVar5.b(matrixArr4[i4], path2);
            } else {
                ifaVar5.b(matrixArr4[i4], path);
            }
            if (mceVar != null) {
                Matrix matrix2 = matrixArr4[i4];
                mceVar2 = mceVar;
                d27 d27Var2 = (d27) mceVar2.a;
                z = false;
                d27Var2.d.set(i4 + 4, false);
                hfa[] hfaVarArr2 = d27Var2.c;
                ifaVar5.a(ifaVar5.e);
                hfaVarArr2[i4] = new bfa(new ArrayList(ifaVar5.g), new Matrix(matrix2));
            } else {
                mceVar2 = mceVar;
                z = false;
            }
            r16 = z;
            mceVar3 = mceVar2;
            i4 = i5;
            ifaVarArr = ifaVarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public aac c() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return aac.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            t67 t67Var = (t67) arrayList.get(i2);
            t67Var.d = i;
            i += t67Var.a.o.b.o();
        }
        return new l09(arrayList, (ska) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            t67 t67Var = (t67) it.next();
            if (t67Var.c.isEmpty()) {
                s67 s67Var = (s67) ((HashMap) this.f).get(t67Var);
                if (s67Var != null) {
                    s67Var.a.c(s67Var.b);
                }
                it.remove();
            }
        }
    }

    public void e(t67 t67Var) {
        if (t67Var.e && t67Var.c.isEmpty()) {
            s67 s67Var = (s67) ((HashMap) this.f).remove(t67Var);
            s67Var.getClass();
            r67 r67Var = s67Var.c;
            ci0 ci0Var = s67Var.a;
            ci0Var.o(s67Var.b);
            ci0Var.r(r67Var);
            ci0Var.q(r67Var);
            ((HashSet) this.h).remove(t67Var);
        }
    }

    public boolean f(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((ifa[]) this.b)[i].b(((Matrix[]) this.c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [f67, m67] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bl3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, j67] */
    public void g(t67 t67Var) {
        w17 w17Var = t67Var.a;
        ?? r1 = new f67() { // from class: m67
            @Override // defpackage.f67
            public final void a(ci0 ci0Var, aac aacVar) {
                ggb ggbVar = ((q04) u67.this.g).D;
                ggbVar.e(2);
                ggbVar.f(22);
            }
        };
        r67 r67Var = new r67(this, t67Var);
        ((HashMap) this.f).put(t67Var, new s67(w17Var, r1, r67Var));
        String str = a2d.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        w17Var.getClass();
        cl3 cl3Var = w17Var.c;
        cl3Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = cl3Var.c;
        ?? obj = new Object();
        obj.a = handler;
        obj.b = r67Var;
        copyOnWriteArrayList.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        cl3 cl3Var2 = w17Var.d;
        cl3Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = cl3Var2.c;
        ?? obj2 = new Object();
        obj2.a = r67Var;
        copyOnWriteArrayList2.add(obj2);
        w17Var.k(r1, (ys2) this.l, (a09) this.b);
    }

    public void h(n57 n57Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        t67 t67Var = (t67) identityHashMap.remove(n57Var);
        t67Var.getClass();
        t67Var.a.n(n57Var);
        t67Var.c.remove(((t17) n57Var).a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(t67Var);
    }

    public void i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            t67 t67Var = (t67) arrayList.remove(i3);
            ((HashMap) this.e).remove(t67Var.b);
            int i4 = -t67Var.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((t67) arrayList.get(i5)).d += i4;
            }
            t67Var.e = true;
            if (this.a) {
                e(t67Var);
            }
        }
    }

    public u67(q04 q04Var, ms2 ms2Var, ggb ggbVar, a09 a09Var) {
        this.b = a09Var;
        this.g = q04Var;
        this.k = new ska();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = ms2Var;
        this.j = ggbVar;
        this.f = new HashMap();
        this.h = new HashSet();
    }
}
