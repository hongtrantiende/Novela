package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kl9  reason: default package */
/* loaded from: classes.dex */
public final class kl9 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public kl9(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = Collections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public void a(rl9 rl9Var, boolean z) {
        j4 j4Var;
        RecyclerView.g(rl9Var);
        View view = rl9Var.a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        tl9 tl9Var = recyclerView.G0;
        if (tl9Var != null) {
            sl9 sl9Var = tl9Var.e;
            if (sl9Var != null) {
                j4Var = (j4) sl9Var.e.remove(view);
            } else {
                j4Var = null;
            }
            rcd.c(view, j4Var);
        }
        if (z) {
            ArrayList arrayList = recyclerView.J;
            if (arrayList.size() <= 0) {
                if (recyclerView.z0 != null) {
                    recyclerView.C.l(rl9Var);
                }
            } else {
                arrayList.get(0).getClass();
                vm1.h();
                return;
            }
        }
        rl9Var.r = null;
        rl9Var.q = null;
        jl9 c = c();
        c.getClass();
        int i = rl9Var.e;
        ArrayList arrayList2 = c.a(i).a;
        if (((il9) c.a.get(i)).b <= arrayList2.size()) {
            c16.k(view);
            return;
        }
        rl9Var.l();
        arrayList2.add(rl9Var);
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        nl9 nl9Var = recyclerView.z0;
        if (i >= 0 && i < nl9Var.b()) {
            if (!nl9Var.f) {
                return i;
            }
            return recyclerView.e.v(i, 0);
        }
        StringBuilder s = hl5.s("invalid position ", ". State item count is ", i);
        s.append(nl9Var.b());
        s.append(recyclerView.w());
        throw new IndexOutOfBoundsException(s.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [jl9, java.lang.Object] */
    public jl9 c() {
        if (((jl9) this.g) == null) {
            ?? obj = new Object();
            obj.a = new SparseArray();
            obj.b = 0;
            obj.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = obj;
            f();
        }
        return (jl9) this.g;
    }

    public sha d() {
        return (sha) ((hm8) this.d).getValue();
    }

    public void e() {
        cga cgaVar;
        Object obj;
        List c = ((jga) this.c).c();
        int size = c.size();
        int i = 0;
        while (true) {
            cgaVar = null;
            if (i < size) {
                obj = c.get(i);
                if (((kga) obj).d().b()) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        kga kgaVar = (kga) obj;
        if (kgaVar != null || ((cga) this.g) != null) {
            if (kgaVar != null) {
                cgaVar = kgaVar.H;
            }
            if (c16.i(cgaVar, (cga) this.g)) {
                return;
            }
            ((em8) this.h).i(this.b + 1);
        }
    }

    public void f() {
        RecyclerView recyclerView;
        yk9 yk9Var;
        jl9 jl9Var = (jl9) this.g;
        if (jl9Var != null && (yk9Var = (recyclerView = (RecyclerView) this.h).H) != null && recyclerView.N) {
            jl9Var.c.add(yk9Var);
        }
    }

    public void g(yk9 yk9Var, boolean z) {
        jl9 jl9Var = (jl9) this.g;
        if (jl9Var != null) {
            SparseArray sparseArray = jl9Var.a;
            Set set = jl9Var.c;
            set.remove(yk9Var);
            if (set.size() == 0 && !z) {
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList arrayList = ((il9) sparseArray.get(sparseArray.keyAt(i))).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        c16.k(((rl9) arrayList.get(i2)).a);
                    }
                }
            }
        }
    }

    public void h() {
        Object obj;
        Object obj2;
        sha d;
        jga jgaVar = (jga) this.c;
        em8 em8Var = (em8) this.e;
        int i = 0;
        if (em8Var.h() != this.a) {
            this.a = em8Var.h();
            int ordinal = ((zya) this.f).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    d = t28.a;
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            xk5.o();
                            return;
                        }
                    } else {
                        List c = jgaVar.c();
                        int size = c.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                if (c16.i(((kga) c.get(i2)).H, (cga) this.g)) {
                                    break;
                                }
                                i2++;
                            } else {
                                d = d().h();
                                break;
                            }
                        }
                    }
                } else {
                    d = d().g((cga) this.g);
                }
            } else {
                d = d();
            }
            ((hm8) this.d).setValue(d);
            this.f = zya.a;
        }
        em8 em8Var2 = (em8) this.h;
        if (em8Var2.h() != this.b) {
            cga cgaVar = null;
            if (jgaVar.b.b()) {
                List c2 = jgaVar.c();
                int size2 = c2.size();
                while (true) {
                    if (i < size2) {
                        obj2 = c2.get(i);
                        if (((kga) obj2).d().b()) {
                            break;
                        }
                        i++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                kga kgaVar = (kga) obj2;
                if (kgaVar != null) {
                    cgaVar = kgaVar.H;
                }
            } else {
                List b = jgaVar.b();
                int size3 = b.size();
                while (true) {
                    if (i < size3) {
                        obj = b.get(i);
                        if (((kga) obj).d().b()) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                kga kgaVar2 = (kga) obj;
                if (kgaVar2 != null) {
                    cgaVar = kgaVar2.H;
                }
            }
            if (!c16.i(cgaVar, (cga) this.g)) {
                this.g = cgaVar;
            }
            this.b = em8Var2.h();
        }
    }

    public void i() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j(size);
        }
        arrayList.clear();
        if (RecyclerView.V0) {
            wh1 wh1Var = ((RecyclerView) this.h).y0;
            int[] iArr = wh1Var.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            wh1Var.d = 0;
        }
    }

    public void j(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((rl9) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void k(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        rl9 F = RecyclerView.F(view);
        if (F.i()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (F.h()) {
            F.m.o(F);
        } else if (F.o()) {
            F.i &= -33;
        }
        l(F);
        if (recyclerView.i0 != null && !F.f()) {
            recyclerView.i0.d(F);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(defpackage.rl9 r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl9.l(rl9):void");
    }

    public void m(View view) {
        cl9 cl9Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        rl9 F = RecyclerView.F(view);
        if ((F.i & 12) == 0 && F.j() && (cl9Var = recyclerView.i0) != null) {
            yu2 yu2Var = (yu2) cl9Var;
            if (F.c().isEmpty() && yu2Var.g && !F.e()) {
                if (((ArrayList) this.d) == null) {
                    this.d = new ArrayList();
                }
                F.m = this;
                F.n = true;
                ((ArrayList) this.d).add(F);
                return;
            }
        }
        if (F.e() && !F.g()) {
            recyclerView.H.getClass();
            vs.m("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.w()));
            return;
        }
        F.m = this;
        F.n = false;
        ((ArrayList) this.c).add(F);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0465 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.rl9 n(int r24, long r25) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl9.n(int, long):rl9");
    }

    public void o(rl9 rl9Var) {
        if (rl9Var.n) {
            ((ArrayList) this.d).remove(rl9Var);
        } else {
            ((ArrayList) this.c).remove(rl9Var);
        }
        rl9Var.m = null;
        rl9Var.n = false;
        rl9Var.i &= -33;
    }

    public void p() {
        int i;
        ArrayList arrayList = (ArrayList) this.e;
        el9 el9Var = ((RecyclerView) this.h).I;
        if (el9Var != null) {
            i = el9Var.i;
        } else {
            i = 0;
        }
        this.b = this.a + i;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            j(size);
        }
    }

    public kl9(jga jgaVar) {
        this.c = jgaVar;
        this.d = yae.z(t28.a);
        this.e = new em8(0);
        this.f = zya.a;
        this.h = new em8(0);
    }
}
