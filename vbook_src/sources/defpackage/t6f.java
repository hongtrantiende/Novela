package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextView;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t6f  reason: default package */
/* loaded from: classes.dex */
public final class t6f implements d7f, zc4 {
    public Object C;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public t6f(t6f t6fVar) {
        ArrayList arrayList;
        this.a = 5;
        this.C = new Object();
        this.c = ((unc) t6fVar.c).o();
        ((iv7) t6fVar.d).getClass();
        this.d = new iv7();
        qm8 qm8Var = (qm8) t6fVar.e;
        qm8Var.getClass();
        this.e = new qm8(qm8Var.a, qm8Var.b);
        this.b = t6fVar.b;
        fkb n = t6fVar.n();
        HashMap hashMap = n.a;
        fkb fkbVar = n.b;
        ArrayList arrayList2 = n.c;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        fkb fkbVar2 = new fkb(fkbVar, arrayList);
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                HashMap hashMap2 = new HashMap(((Map) entry.getValue()).size());
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    hashMap2.put(entry2.getKey(), ((wjb) entry2.getValue()).clone());
                }
                fkbVar2.a.put(entry.getKey(), hashMap2);
            }
        }
        this.f = fkbVar2;
    }

    public static t6f p(String str, s6e s6eVar, int i, eif eifVar, Integer num) {
        if (eifVar == eif.RAW) {
            if (num != null) {
                hfd.j("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            hfd.j("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new t6f(str, k7f.a(str), s6eVar, i, eifVar, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r10 < ((defpackage.wo9) r1.peek()).b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r10, defpackage.km8 r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.e
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.f
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.b
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.b
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            wo9 r3 = (defpackage.wo9) r3
            java.lang.String r5 = defpackage.a2d.a
            long r5 = r3.b
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.d
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            km8 r3 = new km8
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            km8 r3 = (defpackage.km8) r3
        L45:
            int r5 = r12.a()
            r3.J(r5)
            byte[] r5 = r12.a
            int r12 = r12.b
            byte[] r6 = r3.a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.C
            wo9 r12 = (defpackage.wo9) r12
            if (r12 == 0) goto L6c
            long r5 = r12.b
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.a
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            wo9 r12 = new wo9
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            wo9 r12 = (defpackage.wo9) r12
        L7e:
            java.util.ArrayList r0 = r12.a
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            defpackage.wq9.s(r8)
            boolean r2 = r0.isEmpty()
            defpackage.wq9.D(r2)
            r12.b = r10
            r0.add(r3)
            r1.add(r12)
            r9.C = r12
            int r10 = r9.b
            if (r10 == r4) goto L9e
            r9.c(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.c
            xo9 r9 = (defpackage.xo9) r9
            r9.i(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6f.a(long, km8):void");
    }

    public void b() {
        TextView textView = (TextView) this.c;
        Drawable background = textView.getBackground();
        if (background != null) {
            if (((kc1) this.e) != null) {
                if (((kc1) this.C) == null) {
                    this.C = new Object();
                }
                kc1 kc1Var = (kc1) this.C;
                kc1Var.c = null;
                kc1Var.b = false;
                kc1Var.d = null;
                kc1Var.a = false;
                Field field = rcd.a;
                ColorStateList backgroundTintList = textView.getBackgroundTintList();
                if (backgroundTintList != null) {
                    kc1Var.b = true;
                    kc1Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = textView.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    kc1Var.a = true;
                    kc1Var.d = backgroundTintMode;
                }
                if (kc1Var.b || kc1Var.a) {
                    zv.c(background, kc1Var, textView.getDrawableState());
                    return;
                }
            }
            kc1 kc1Var2 = (kc1) this.f;
            if (kc1Var2 != null) {
                zv.c(background, kc1Var2, textView.getDrawableState());
                return;
            }
            kc1 kc1Var3 = (kc1) this.e;
            if (kc1Var3 != null) {
                zv.c(background, kc1Var3, textView.getDrawableState());
            }
        }
    }

    public void c(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f;
        while (priorityQueue.size() > i) {
            wo9 wo9Var = (wo9) priorityQueue.poll();
            String str = a2d.a;
            int i2 = 0;
            while (true) {
                arrayList = wo9Var.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((xo9) this.c).i(wo9Var.b, (km8) arrayList.get(i2));
                ((ArrayDeque) this.d).push((km8) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            wo9 wo9Var2 = (wo9) this.C;
            if (wo9Var2 != null && wo9Var2.b == wo9Var.b) {
                this.C = null;
            }
            ((ArrayDeque) this.e).push(wo9Var);
        }
    }

    public Object clone() {
        switch (this.a) {
            case 5:
                return new t6f(this);
            default:
                return super.clone();
        }
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int resourceId;
        ColorStateList g;
        TextView textView = (TextView) this.c;
        Context context = textView.getContext();
        int[] iArr = gg9.h;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView2 = (TextView) this.c;
        rcd.b(textView2, textView2.getContext(), iArr, attributeSet, obtainStyledAttributes, i);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                this.b = obtainStyledAttributes.getResourceId(0, -1);
                zv zvVar = (zv) this.d;
                Context context2 = textView.getContext();
                int i2 = this.b;
                synchronized (zvVar) {
                    g = zvVar.a.g(context2, i2);
                }
                if (g != null) {
                    l(g);
                }
            }
            if (obtainStyledAttributes.hasValue(1)) {
                if (!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0 || (colorStateList = eze.l(context, resourceId)) == null) {
                    colorStateList = obtainStyledAttributes.getColorStateList(1);
                }
                textView.setBackgroundTintList(colorStateList);
            }
            if (obtainStyledAttributes.hasValue(2)) {
                textView.setBackgroundTintMode(xk3.a(obtainStyledAttributes.getInt(2, -1)));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.zc4
    public Object e(Map map, m42 m42Var) {
        ArrayList arrayList;
        ic3 ic3Var;
        int i;
        bc3 bc3Var = (bc3) ((mfb) this.C).getValue();
        List<wf8> list = ((rm8) bc3Var.b.getValue()).f;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            arrayList = new ArrayList(tl1.s(list, 10));
            for (wf8 wf8Var : list) {
                arrayList.add(new ic3(wf8Var.b, wf8Var.a));
            }
        } else {
            List list2 = ((rm8) bc3Var.b.getValue()).c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (((zj5) obj).a == ak5.c) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                zj5 zj5Var = (zj5) obj2;
                String str = zj5Var.b;
                if (str != null) {
                    Integer num = zj5Var.d;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 1;
                    }
                    ic3Var = new ic3(str, i);
                } else {
                    ic3Var = null;
                }
                if (ic3Var != null) {
                    arrayList.add(ic3Var);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(tl1.s(arrayList, 10));
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj3 = arrayList.get(i4);
            i4++;
            int i5 = i2 + 1;
            if (i2 >= 0) {
                arrayList3.add(new ic4(((ic3) obj3).a, i2, 1));
                i2 = i5;
            } else {
                tl1.M();
                throw null;
            }
        }
        return arrayList3;
    }

    public uc3 f(String str, String str2) {
        uc3 q;
        str.getClass();
        StringReader stringReader = new StringReader(str);
        synchronized (this.C) {
            q = ((unc) this.c).q(stringReader, str2, this);
        }
        return q;
    }

    public void g(c16 c16Var) {
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.d;
        arrayList2.add(c16Var);
        boolean z = false;
        if (arrayList2.size() > this.b) {
            arrayList2.remove(0);
        }
        arrayList.clear();
        ((em8) this.f).i(arrayList2.size());
        ((em8) this.C).i(arrayList.size());
        u0 u0Var = (u0) this.c;
        if (arrayList2.size() > 0) {
            z = true;
        }
        u0Var.invoke(Boolean.valueOf(z));
    }

    public void h(u95 u95Var) {
        int r0 = b00.r0(u95Var, (u95[]) this.c);
        if (r0 >= 0) {
            u95[] u95VarArr = (u95[]) this.c;
            int i = r0 + 1;
            b00.W(r0, i, this.b, u95VarArr, u95VarArr);
            int i2 = this.b;
            ((u95[]) this.c)[i2 - 1] = null;
            float[] fArr = (float[]) this.d;
            System.arraycopy(fArr, i, fArr, r0, i2 - i);
            byte[] bArr = (byte[]) this.e;
            b00.U(r0, i, this.b, bArr, bArr);
            this.b--;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:16|17|(1:19)|20|21|22|(1:24)(4:108|(1:109)|111|112)|25|(1:27)(1:107)|28|29|30|31|32|33|34|(3:36|37|(2:39|(2:41|(2:43|(2:45|46)(17:47|17|(0)|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|33|34|(1:95)(0)))(14:48|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|33|34|(0)(0)))(2:49|50))(8:51|(1:53)(2:85|(2:87|(4:88|(1:90)|91|(1:94)(1:93)))(0))|54|(1:56)(1:84)|57|(8:59|60|61|(1:63)|65|66|67|(1:69))|80|(1:83)(3:82|11|12)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:99|100|101|102|103) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0499, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x049b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x049d, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04a2, code lost:
        defpackage.pye.e(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04a5, code lost:
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x041d  */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x03a7 -> B:86:0x03b5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x03d0 -> B:90:0x03cb). Please submit an issue!!! */
    @Override // defpackage.zc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.String r47, java.util.Map r48, defpackage.n42 r49) {
        /*
            Method dump skipped, instructions count: 1627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6f.i(java.lang.String, java.util.Map, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    @Override // defpackage.zc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.m42 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.dc3
            if (r0 == 0) goto L13
            r0 = r15
            dc3 r0 = (defpackage.dc3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            dc3 r0 = new dc3
            n42 r15 = (defpackage.n42) r15
            r0.<init>(r14, r15)
        L1a:
            java.lang.Object r15 = r0.c
            int r1 = r0.e
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 != r3) goto L30
            java.lang.String r1 = r0.b
            zb3 r0 = r0.a
            defpackage.hre.r(r15)
            r7 = r1
            goto L9d
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r14)
            return r4
        L36:
            defpackage.hre.r(r15)
            java.lang.Object r15 = r14.C
            mfb r15 = (defpackage.mfb) r15
            java.lang.Object r15 = r15.getValue()
            bc3 r15 = (defpackage.bc3) r15
            zb3 r15 = r15.a()
            java.lang.String r1 = r15.a
            java.lang.String r5 = r15.b
            int r6 = r5.length()
            if (r6 != 0) goto L68
            qa5 r5 = defpackage.qa5.a
            uc3 r5 = defpackage.qa5.f(r1)
            java.lang.String r6 = "h1"
            cp3 r5 = r5.X(r6)
            if (r5 == 0) goto L64
            java.lang.String r5 = r5.Z()
            goto L65
        L64:
            r5 = r4
        L65:
            if (r5 != 0) goto L68
            r5 = r2
        L68:
            qa5 r6 = defpackage.qa5.a
            uc3 r1 = defpackage.qa5.f(r1)
            cp3 r1 = r1.a0()
            ra5 r6 = defpackage.qa5.e()
            ps r1 = r6.d(r1)
            ps r1 = defpackage.qa5.g(r1)
            java.lang.String r1 = r1.b
            java.lang.Object r6 = r14.f
            uz6 r6 = (defpackage.uz6) r6
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = defpackage.k4b.L0(r7, r1)
            r0.a = r15
            r0.b = r5
            r0.e = r3
            java.lang.Object r0 = r6.a(r1, r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L99
            return r1
        L99:
            r7 = r0
            r0 = r15
            r15 = r7
            r7 = r5
        L9d:
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r15 = defpackage.sl1.e0(r15)
            cl5 r15 = (defpackage.cl5) r15
            if (r15 == 0) goto La9
            java.lang.String r4 = r15.a
        La9:
            if (r4 != 0) goto Lad
            r12 = r2
            goto Lae
        Lad:
            r12 = r4
        Lae:
            ad4 r5 = new ad4
            java.lang.Object r15 = r14.c
            r6 = r15
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r0.c
            int r11 = r14.b
            v56 r14 = defpackage.fd1.b
            java.lang.String r13 = r14.b()
            r9 = 0
            r10 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6f.j(m42):java.lang.Object");
    }

    public void k(Runnable runnable) {
        ggb ggbVar = (ggb) this.c;
        if (!ggbVar.a.getLooper().getThread().isAlive()) {
            return;
        }
        ggbVar.d(runnable);
    }

    public void l(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((kc1) this.e) == null) {
                this.e = new Object();
            }
            kc1 kc1Var = (kc1) this.e;
            kc1Var.c = colorStateList;
            kc1Var.b = true;
        } else {
            this.e = null;
        }
        b();
    }

    public void m(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        this.b = i;
        c(i);
    }

    public fkb n() {
        if (((fkb) this.f) == null) {
            this.f = ((unc) this.c).f();
        }
        fkb fkbVar = (fkb) this.f;
        fkbVar.getClass();
        return fkbVar;
    }

    public void o(Object obj) {
        Object obj2 = this.f;
        this.f = obj;
        if (!obj2.equals(obj)) {
            i04 i04Var = ((wz3) this.e).a;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            i04Var.X();
            i04Var.J(1, num, 10);
            i04Var.J(2, num, 10);
            i04Var.m.e(21, new is2(intValue, 1));
        }
    }

    public t6f(sk1 sk1Var, u0 u0Var) {
        this.a = 8;
        this.c = u0Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 100;
        this.f = new em8(0);
        this.C = new em8(0);
    }

    public t6f(String str, int i, String str2, ii2 ii2Var, uz6 uz6Var) {
        this.a = 3;
        this.c = str;
        this.b = i;
        this.d = str2;
        this.e = ii2Var;
        this.f = uz6Var;
        this.C = new mfb(new t42(this, 9));
    }

    public t6f(TextView textView) {
        zv zvVar;
        this.a = 1;
        this.b = -1;
        this.c = textView;
        PorterDuff.Mode mode = zv.b;
        synchronized (zv.class) {
            try {
                if (zv.c == null) {
                    zv.b();
                }
                zvVar = zv.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = zvVar;
    }

    public t6f(unc uncVar) {
        this.a = 5;
        this.C = new Object();
        this.c = uncVar;
        this.e = uncVar.e();
        this.d = new iv7();
        this.b = uncVar.c();
    }

    public t6f(xo9 xo9Var) {
        this.a = 6;
        this.c = xo9Var;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = new PriorityQueue();
        this.b = -1;
    }

    public t6f(String str, hlf hlfVar, s6e s6eVar, int i, eif eifVar, Integer num) {
        this.a = 0;
        this.c = str;
        this.d = hlfVar;
        this.e = s6eVar;
        this.b = i;
        this.f = eifVar;
        this.C = num;
    }

    public t6f(Object obj, Looper looper, Looper looper2, xfb xfbVar, wz3 wz3Var) {
        this.a = 2;
        this.c = xfbVar.a(looper, null);
        this.d = xfbVar.a(looper2, null);
        this.f = obj;
        this.C = obj;
        this.e = wz3Var;
    }

    public t6f(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.c = new u95[32];
                this.d = new float[32];
                this.e = new byte[32];
                uv7 uv7Var = uz9.a;
                this.f = new uv7();
                this.C = new uv7();
                return;
            default:
                this.c = new kj(10, false);
                this.d = new HashMap();
                this.e = new HashSet();
                this.f = new ArrayList();
                this.C = new ArrayList();
                return;
        }
    }
}
