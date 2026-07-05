package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rl  reason: default package */
/* loaded from: classes.dex */
public final class rl extends mq7 implements wx1, zj3, oc6 {
    public final gz5 K;
    public final boolean L;
    public final float M;
    public final mu9 N;
    public final y03 O;
    public float P;
    public boolean R;
    public ez5 V;
    public mp8 Y;
    public gt9 Z;
    public ht9 a0;
    public long Q = 0;
    public final kv7 S = new kv7();
    public final lq T = tc4.a(nae.e, 0.01f);
    public final ArrayList U = new ArrayList();
    public final lq W = tc4.a(nae.e, 0.01f);
    public final hm8 X = yae.z(Boolean.FALSE);

    public rl(gz5 gz5Var, boolean z, float f, mu9 mu9Var, y03 y03Var) {
        this.K = gz5Var;
        this.L = z;
        this.M = f;
        this.N = mu9Var;
        this.O = y03Var;
    }

    @Override // defpackage.mq7
    public final void A1() {
        gt9 gt9Var = this.Z;
        if (gt9Var != null) {
            this.a0 = null;
            hud.o(this);
            eb5 eb5Var = gt9Var.d;
            ht9 ht9Var = (ht9) ((LinkedHashMap) eb5Var.b).get(this);
            if (ht9Var != null) {
                ht9Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) eb5Var.b;
                ht9 ht9Var2 = (ht9) linkedHashMap.get(this);
                if (ht9Var2 != null) {
                    rl rlVar = (rl) ((LinkedHashMap) eb5Var.c).remove(ht9Var2);
                }
                linkedHashMap.remove(this);
                gt9Var.c.add(ht9Var);
            }
        }
    }

    public final void H1(n59 n59Var) {
        ht9 ht9Var;
        Object remove;
        ht9 ht9Var2;
        float f;
        if (n59Var instanceof l59) {
            l59 l59Var = (l59) n59Var;
            long j = this.Q;
            float f2 = this.P;
            gt9 gt9Var = this.Z;
            if (gt9Var == null) {
                View view = (View) nye.q(this, gh.f);
                while (!(view instanceof ViewGroup)) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = parent;
                    } else {
                        hfd.h(view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                        return;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof gt9) {
                            gt9Var = (gt9) childAt;
                            break;
                        }
                        i++;
                    } else {
                        gt9 gt9Var2 = new gt9(viewGroup.getContext());
                        viewGroup.addView(gt9Var2);
                        gt9Var = gt9Var2;
                        break;
                    }
                }
                this.Z = gt9Var;
            }
            ArrayList arrayList = gt9Var.b;
            eb5 eb5Var = gt9Var.d;
            LinkedHashMap linkedHashMap = (LinkedHashMap) eb5Var.b;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) eb5Var.c;
            ht9 ht9Var3 = (ht9) ((LinkedHashMap) eb5Var.b).get(this);
            if (ht9Var3 == null) {
                ArrayList arrayList2 = gt9Var.c;
                arrayList2.getClass();
                if (arrayList2.isEmpty()) {
                    remove = null;
                } else {
                    remove = arrayList2.remove(0);
                }
                ht9 ht9Var4 = (ht9) remove;
                ht9Var3 = ht9Var4;
                if (ht9Var4 == null) {
                    if (gt9Var.e > tl1.x(arrayList)) {
                        View view2 = new View(gt9Var.getContext());
                        gt9Var.addView(view2);
                        arrayList.add(view2);
                        ht9Var2 = view2;
                    } else {
                        ht9 ht9Var5 = (ht9) arrayList.get(gt9Var.e);
                        rl rlVar = (rl) linkedHashMap2.get(ht9Var5);
                        ht9Var2 = ht9Var5;
                        if (rlVar != null) {
                            rlVar.a0 = null;
                            hud.o(rlVar);
                            ht9 ht9Var6 = (ht9) linkedHashMap.get(rlVar);
                            if (ht9Var6 != null) {
                                rl rlVar2 = (rl) linkedHashMap2.remove(ht9Var6);
                            }
                            linkedHashMap.remove(rlVar);
                            ht9Var5.c();
                            ht9Var2 = ht9Var5;
                        }
                    }
                    int i2 = gt9Var.e;
                    if (i2 < gt9Var.a - 1) {
                        gt9Var.e = i2 + 1;
                        ht9Var3 = ht9Var2;
                    } else {
                        gt9Var.e = 0;
                        ht9Var3 = ht9Var2;
                    }
                }
                linkedHashMap.put(this, ht9Var3);
                linkedHashMap2.put(ht9Var3, this);
            }
            ht9 ht9Var7 = ht9Var3;
            if (((tt9) this.O.invoke()).a instanceof st9) {
                f = 0.1f;
            } else {
                f = nae.e;
            }
            ht9Var7.b(l59Var, this.L, j, k27.A(f2), this.N.d(), f, new ve(this, 5));
            this.a0 = ht9Var7;
            hud.o(this);
        } else if (n59Var instanceof m59) {
            ht9 ht9Var8 = this.a0;
            if (ht9Var8 != null) {
                ht9Var8.d();
            }
        } else if ((n59Var instanceof k59) && (ht9Var = this.a0) != null) {
            ht9Var.d();
        }
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        long j;
        float f;
        qd6Var.a();
        n61 n61Var = qd6Var.a;
        k61 w = n61Var.b.w();
        ht9 ht9Var = this.a0;
        if (ht9Var != null) {
            if (((tt9) this.O.invoke()).a instanceof st9) {
                f = 0.1f;
            } else {
                f = 0.0f;
            }
            ht9Var.e(this.Q, k27.A(this.P), this.N.d(), f);
            ht9Var.draw(tf.a(w));
        }
        float floatValue = ((Number) this.T.e()).floatValue();
        if (floatValue > nae.e) {
            long b = zl1.b(floatValue, this.N.d());
            if (this.L) {
                float intBitsToFloat = Float.intBitsToFloat((int) (n61Var.b() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (n61Var.b() & 4294967295L));
                ij1 ij1Var = n61Var.b;
                long G = ij1Var.G();
                ij1Var.w().i();
                try {
                    ((mu9) ij1Var.b).n(nae.e, nae.e, intBitsToFloat, intBitsToFloat2, 1);
                    j = G;
                    try {
                        ak3.D0(qd6Var, b, this.P, 0L, nae.e, null, Token.IMPORT);
                        rs8.r(ij1Var, j);
                    } catch (Throwable th) {
                        th = th;
                        rs8.r(ij1Var, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = G;
                }
            } else {
                ak3.D0(qd6Var, b, this.P, 0L, nae.e, null, Token.IMPORT);
            }
        }
        if (((Number) this.W.e()).floatValue() > nae.e) {
            mp8 mp8Var = this.Y;
            if (mp8Var == null) {
                mp8Var = new mp8(2);
            }
            this.Y = mp8Var;
            this.O.invoke();
        }
    }

    @Override // defpackage.oc6, defpackage.i37
    public final void g(long j) {
        float L0;
        this.R = true;
        r13 r13Var = voe.v(this).V;
        this.Q = eg0.A(j);
        float f = this.M;
        if (Float.isNaN(f)) {
            long j2 = this.Q;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            L0 = y78.e((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.L) {
                L0 += r13Var.L0(10.0f);
            }
        } else {
            L0 = r13Var.L0(f);
        }
        this.P = L0;
        kv7 kv7Var = this.S;
        Object[] objArr = kv7Var.a;
        int i = kv7Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            H1((n59) objArr[i2]);
        }
        kv7Var.d();
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        z87.v(v1(), null, null, new z38(this, null, 14), 3);
    }
}
