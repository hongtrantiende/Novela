package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.vbook.android.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hs4  reason: default package */
/* loaded from: classes.dex */
public final class hs4 {
    public final bs4 A;
    public final cne B;
    public o6 C;
    public o6 D;
    public o6 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public js4 O;
    public final og P;
    public boolean b;
    public ArrayList e;
    public tb8 g;
    public final ArrayList n;
    public final s6f o;
    public final CopyOnWriteArrayList p;
    public final zr4 q;
    public final zr4 r;
    public final zr4 s;
    public final zr4 t;
    public final as4 u;
    public int v;
    public tr4 w;
    public obe x;
    public rr4 y;
    public rr4 z;
    public final ArrayList a = new ArrayList();
    public final oaa c = new oaa(11);
    public ArrayList d = new ArrayList();
    public final yr4 f = new yr4(this);
    public uf0 h = null;
    public boolean i = false;
    public final if0 j = new if0(this, 1);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v14, types: [s6f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [zr4] */
    /* JADX WARN: Type inference failed for: r0v17, types: [zr4] */
    /* JADX WARN: Type inference failed for: r0v18, types: [zr4] */
    /* JADX WARN: Type inference failed for: r0v19, types: [zr4] */
    public hs4() {
        Collections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        ?? obj = new Object();
        obj.a = this;
        obj.b = new CopyOnWriteArrayList();
        this.o = obj;
        this.p = new CopyOnWriteArrayList();
        this.q = new i12(this) { // from class: zr4
            public final /* synthetic */ hs4 b;

            {
                this.b = this;
            }

            @Override // defpackage.i12
            public final void accept(Object obj2) {
                int i = r2;
                hs4 hs4Var = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj2;
                        if (hs4Var.M()) {
                            hs4Var.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj2;
                        if (hs4Var.M() && num.intValue() == 80) {
                            hs4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        du7 du7Var = (du7) obj2;
                        if (hs4Var.M()) {
                            boolean z = du7Var.a;
                            hs4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        hv8 hv8Var = (hv8) obj2;
                        if (hs4Var.M()) {
                            boolean z2 = hv8Var.a;
                            hs4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.r = new i12(this) { // from class: zr4
            public final /* synthetic */ hs4 b;

            {
                this.b = this;
            }

            @Override // defpackage.i12
            public final void accept(Object obj2) {
                int i = r2;
                hs4 hs4Var = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj2;
                        if (hs4Var.M()) {
                            hs4Var.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj2;
                        if (hs4Var.M() && num.intValue() == 80) {
                            hs4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        du7 du7Var = (du7) obj2;
                        if (hs4Var.M()) {
                            boolean z = du7Var.a;
                            hs4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        hv8 hv8Var = (hv8) obj2;
                        if (hs4Var.M()) {
                            boolean z2 = hv8Var.a;
                            hs4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.s = new i12(this) { // from class: zr4
            public final /* synthetic */ hs4 b;

            {
                this.b = this;
            }

            @Override // defpackage.i12
            public final void accept(Object obj2) {
                int i = r2;
                hs4 hs4Var = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj2;
                        if (hs4Var.M()) {
                            hs4Var.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj2;
                        if (hs4Var.M() && num.intValue() == 80) {
                            hs4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        du7 du7Var = (du7) obj2;
                        if (hs4Var.M()) {
                            boolean z = du7Var.a;
                            hs4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        hv8 hv8Var = (hv8) obj2;
                        if (hs4Var.M()) {
                            boolean z2 = hv8Var.a;
                            hs4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.t = new i12(this) { // from class: zr4
            public final /* synthetic */ hs4 b;

            {
                this.b = this;
            }

            @Override // defpackage.i12
            public final void accept(Object obj2) {
                int i = r2;
                hs4 hs4Var = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj2;
                        if (hs4Var.M()) {
                            hs4Var.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj2;
                        if (hs4Var.M() && num.intValue() == 80) {
                            hs4Var.m(false);
                            return;
                        }
                        return;
                    case 2:
                        du7 du7Var = (du7) obj2;
                        if (hs4Var.M()) {
                            boolean z = du7Var.a;
                            hs4Var.n(false);
                            return;
                        }
                        return;
                    default:
                        hv8 hv8Var = (hv8) obj2;
                        if (hs4Var.M()) {
                            boolean z2 = hv8Var.a;
                            hs4Var.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.u = new as4(this);
        this.v = -1;
        this.A = new bs4(this);
        this.B = new cne(25);
        this.F = new ArrayDeque();
        this.P = new og(this, 5);
    }

    public static HashSet F(uf0 uf0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < uf0Var.a.size(); i++) {
            rr4 rr4Var = ((qs4) uf0Var.a.get(i)).b;
            if (rr4Var != null && uf0Var.g) {
                hashSet.add(rr4Var);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean L(rr4 rr4Var) {
        rr4Var.getClass();
        ArrayList x = rr4Var.R.c.x();
        int size = x.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = x.get(i);
            i++;
            rr4 rr4Var2 = (rr4) obj;
            if (rr4Var2 != null) {
                z = L(rr4Var2);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(rr4 rr4Var) {
        if (rr4Var != null) {
            if (rr4Var.Z) {
                if (rr4Var.P == null || N(rr4Var.S)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean O(rr4 rr4Var) {
        if (rr4Var != null) {
            hs4 hs4Var = rr4Var.P;
            if (rr4Var == hs4Var.z && O(hs4Var.y)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void c0(rr4 rr4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + rr4Var);
        }
        if (rr4Var.W) {
            rr4Var.W = false;
            rr4Var.f0 = !rr4Var.f0;
        }
    }

    public final boolean A(boolean z) {
        boolean z2;
        ArrayList arrayList;
        uf0 uf0Var;
        z(z);
        if (!this.i && (uf0Var = this.h) != null) {
            uf0Var.r = false;
            uf0Var.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            ArrayList arrayList2 = this.h.a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                rr4 rr4Var = ((qs4) obj).b;
                if (rr4Var != null) {
                    rr4Var.I = false;
                }
            }
            this.h = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    int size2 = this.a.size();
                    int i2 = 0;
                    z2 = false;
                    while (true) {
                        arrayList = this.a;
                        if (i2 >= size2) {
                            break;
                        }
                        z2 |= ((es4) arrayList.get(i2)).a(arrayList3, arrayList4);
                        i2++;
                    }
                    arrayList.clear();
                    this.w.e.removeCallbacks(this.P);
                }
            }
            if (z2) {
                z3 = true;
                this.b = true;
                try {
                    U(this.L, this.M);
                } finally {
                    d();
                }
            } else {
                f0();
                v();
                ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
                return z3;
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        String str;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        oaa oaaVar = this.c;
        ArrayList arrayList3 = this.n;
        boolean z4 = ((uf0) arrayList.get(i)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(oaaVar.z());
        rr4 rr4Var = this.z;
        int i6 = i;
        boolean z5 = false;
        while (i6 < i2) {
            uf0 uf0Var = (uf0) arrayList.get(i6);
            boolean booleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList5 = this.N;
            if (!booleanValue) {
                ArrayList arrayList6 = uf0Var.a;
                int i7 = 0;
                while (i7 < arrayList6.size()) {
                    qs4 qs4Var = (qs4) arrayList6.get(i7);
                    boolean z6 = z4;
                    int i8 = qs4Var.a;
                    int i9 = i6;
                    int i10 = 1;
                    if (i8 != 1) {
                        z3 = z5;
                        if (i8 != 2) {
                            if (i8 != 3 && i8 != 6) {
                                if (i8 != 7) {
                                    if (i8 == 8) {
                                        arrayList6.add(i7, new qs4(9, rr4Var, 0));
                                        qs4Var.c = true;
                                        i7++;
                                        rr4Var = qs4Var.b;
                                    }
                                } else {
                                    i10 = 1;
                                }
                            } else {
                                arrayList5.remove(qs4Var.b);
                                rr4 rr4Var2 = qs4Var.b;
                                if (rr4Var2 == rr4Var) {
                                    arrayList6.add(i7, new qs4(9, rr4Var2));
                                    i7++;
                                    rr4Var = null;
                                }
                            }
                            i10 = 1;
                        } else {
                            rr4 rr4Var3 = qs4Var.b;
                            int i11 = rr4Var3.U;
                            int size = arrayList5.size() - 1;
                            boolean z7 = false;
                            while (size >= 0) {
                                int i12 = size;
                                rr4 rr4Var4 = (rr4) arrayList5.get(size);
                                if (rr4Var4.U == i11) {
                                    if (rr4Var4 == rr4Var3) {
                                        i4 = i11;
                                        z7 = true;
                                    } else {
                                        if (rr4Var4 == rr4Var) {
                                            i4 = i11;
                                            arrayList6.add(i7, new qs4(9, rr4Var4, 0));
                                            i7++;
                                            i5 = 0;
                                            rr4Var = null;
                                        } else {
                                            i4 = i11;
                                            i5 = 0;
                                        }
                                        qs4 qs4Var2 = new qs4(3, rr4Var4, i5);
                                        qs4Var2.d = qs4Var.d;
                                        qs4Var2.f = qs4Var.f;
                                        qs4Var2.e = qs4Var.e;
                                        qs4Var2.g = qs4Var.g;
                                        arrayList6.add(i7, qs4Var2);
                                        arrayList5.remove(rr4Var4);
                                        i7++;
                                        rr4Var = rr4Var;
                                    }
                                } else {
                                    i4 = i11;
                                }
                                size = i12 - 1;
                                i11 = i4;
                            }
                            i10 = 1;
                            if (z7) {
                                arrayList6.remove(i7);
                                i7--;
                            } else {
                                qs4Var.a = 1;
                                qs4Var.c = true;
                                arrayList5.add(rr4Var3);
                            }
                        }
                        i7 += i10;
                        z4 = z6;
                        i6 = i9;
                        z5 = z3;
                    } else {
                        z3 = z5;
                    }
                    arrayList5.add(qs4Var.b);
                    i7 += i10;
                    z4 = z6;
                    i6 = i9;
                    z5 = z3;
                }
                z = z4;
                i3 = i6;
                z2 = z5;
            } else {
                z = z4;
                i3 = i6;
                z2 = z5;
                int i13 = 1;
                ArrayList arrayList7 = uf0Var.a;
                int size2 = arrayList7.size() - 1;
                while (size2 >= 0) {
                    qs4 qs4Var3 = (qs4) arrayList7.get(size2);
                    int i14 = qs4Var3.a;
                    if (i14 != i13) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 8:
                                    rr4Var = null;
                                    break;
                                case 9:
                                    rr4Var = qs4Var3.b;
                                    break;
                                case 10:
                                    qs4Var3.i = qs4Var3.h;
                                    break;
                            }
                            size2--;
                            i13 = 1;
                        }
                        arrayList5.add(qs4Var3.b);
                        size2--;
                        i13 = 1;
                    }
                    arrayList5.remove(qs4Var3.b);
                    size2--;
                    i13 = 1;
                }
            }
            if (!z2 && !uf0Var.g) {
                z5 = false;
            } else {
                z5 = true;
            }
            i6 = i3 + 1;
            z4 = z;
        }
        boolean z8 = z4;
        boolean z9 = z5;
        this.N.clear();
        if (!z8 && this.v >= 1) {
            for (int i15 = i; i15 < i2; i15++) {
                ArrayList arrayList8 = ((uf0) arrayList.get(i15)).a;
                int size3 = arrayList8.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList8.get(i16);
                    i16++;
                    rr4 rr4Var5 = ((qs4) obj).b;
                    if (rr4Var5 != null && rr4Var5.P != null) {
                        oaaVar.H(g(rr4Var5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i17 = i;
        while (i17 < i2) {
            uf0 uf0Var2 = (uf0) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                uf0Var2.c(-1);
                hs4 hs4Var = uf0Var2.q;
                ArrayList arrayList9 = uf0Var2.a;
                boolean z10 = true;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    qs4 qs4Var4 = (qs4) arrayList9.get(size4);
                    rr4 rr4Var6 = qs4Var4.b;
                    if (rr4Var6 != null) {
                        if (rr4Var6.e0 != null) {
                            rr4Var6.l().a = z10;
                        }
                        int i18 = uf0Var2.f;
                        int i19 = 8194;
                        int i20 = 4097;
                        if (i18 != 4097) {
                            if (i18 != 8194) {
                                i19 = 4100;
                                if (i18 != 8197) {
                                    i20 = 4099;
                                    if (i18 != 4099) {
                                        if (i18 != 4100) {
                                            i19 = 0;
                                        } else {
                                            i19 = 8197;
                                        }
                                    }
                                }
                            }
                            i19 = i20;
                        }
                        if (rr4Var6.e0 != null || i19 != 0) {
                            rr4Var6.l();
                            rr4Var6.e0.f = i19;
                        }
                        rr4Var6.l();
                        rr4Var6.e0.getClass();
                    }
                    switch (qs4Var4.a) {
                        case 1:
                            rr4Var6.H(qs4Var4.d, qs4Var4.e, qs4Var4.f, qs4Var4.g);
                            z10 = true;
                            hs4Var.Y(rr4Var6, true);
                            hs4Var.T(rr4Var6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + qs4Var4.a);
                        case 3:
                            rr4Var6.H(qs4Var4.d, qs4Var4.e, qs4Var4.f, qs4Var4.g);
                            hs4Var.a(rr4Var6);
                            z10 = true;
                            break;
                        case 4:
                            rr4Var6.H(qs4Var4.d, qs4Var4.e, qs4Var4.f, qs4Var4.g);
                            hs4Var.getClass();
                            c0(rr4Var6);
                            z10 = true;
                            break;
                        case 5:
                            rr4Var6.H(qs4Var4.d, qs4Var4.e, qs4Var4.f, qs4Var4.g);
                            hs4Var.Y(rr4Var6, true);
                            hs4Var.J(rr4Var6);
                            z10 = true;
                            break;
                        case 6:
                            rr4Var6.H(qs4Var4.d, qs4Var4.e, qs4Var4.f, qs4Var4.g);
                            hs4Var.c(rr4Var6);
                            z10 = true;
                            break;
                        case 7:
                            rr4Var6.H(qs4Var4.d, qs4Var4.e, qs4Var4.f, qs4Var4.g);
                            hs4Var.Y(rr4Var6, true);
                            hs4Var.h(rr4Var6);
                            z10 = true;
                            break;
                        case 8:
                            hs4Var.a0(null);
                            z10 = true;
                            break;
                        case 9:
                            hs4Var.a0(rr4Var6);
                            z10 = true;
                            break;
                        case 10:
                            qs4Var4.i = rr4Var6.i0;
                            hs4Var.Z(rr4Var6, qs4Var4.h);
                            z10 = true;
                            break;
                    }
                }
            } else {
                uf0Var2.c(1);
                hs4 hs4Var2 = uf0Var2.q;
                ArrayList arrayList10 = uf0Var2.a;
                int size5 = arrayList10.size();
                int i21 = 0;
                while (i21 < size5) {
                    qs4 qs4Var5 = (qs4) arrayList10.get(i21);
                    rr4 rr4Var7 = qs4Var5.b;
                    if (rr4Var7 != null) {
                        if (rr4Var7.e0 != null) {
                            rr4Var7.l().a = false;
                        }
                        int i22 = uf0Var2.f;
                        if (rr4Var7.e0 != null || i22 != 0) {
                            rr4Var7.l();
                            rr4Var7.e0.f = i22;
                        }
                        rr4Var7.l();
                        rr4Var7.e0.getClass();
                    }
                    switch (qs4Var5.a) {
                        case 1:
                            str = str2;
                            rr4Var7.H(qs4Var5.d, qs4Var5.e, qs4Var5.f, qs4Var5.g);
                            hs4Var2.Y(rr4Var7, false);
                            hs4Var2.a(rr4Var7);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + qs4Var5.a);
                        case 3:
                            str = str2;
                            rr4Var7.H(qs4Var5.d, qs4Var5.e, qs4Var5.f, qs4Var5.g);
                            hs4Var2.T(rr4Var7);
                            break;
                        case 4:
                            str = str2;
                            rr4Var7.H(qs4Var5.d, qs4Var5.e, qs4Var5.f, qs4Var5.g);
                            hs4Var2.J(rr4Var7);
                            break;
                        case 5:
                            str = str2;
                            rr4Var7.H(qs4Var5.d, qs4Var5.e, qs4Var5.f, qs4Var5.g);
                            hs4Var2.Y(rr4Var7, false);
                            c0(rr4Var7);
                            break;
                        case 6:
                            str = str2;
                            rr4Var7.H(qs4Var5.d, qs4Var5.e, qs4Var5.f, qs4Var5.g);
                            hs4Var2.h(rr4Var7);
                            break;
                        case 7:
                            str = str2;
                            rr4Var7.H(qs4Var5.d, qs4Var5.e, qs4Var5.f, qs4Var5.g);
                            hs4Var2.Y(rr4Var7, false);
                            hs4Var2.c(rr4Var7);
                            break;
                        case 8:
                            hs4Var2.a0(rr4Var7);
                            str = str2;
                            break;
                        case 9:
                            hs4Var2.a0(null);
                            str = str2;
                            break;
                        case 10:
                            qs4Var5.h = rr4Var7.i0;
                            hs4Var2.Z(rr4Var7, qs4Var5.i);
                            str = str2;
                            break;
                    }
                    i21++;
                    str2 = str;
                }
            }
            i17++;
            str2 = str2;
        }
        boolean booleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i23 = 0;
            while (i23 < size6) {
                Object obj2 = arrayList.get(i23);
                i23++;
                linkedHashSet.addAll(F((uf0) obj2));
            }
            if (this.h == null) {
                int size7 = arrayList3.size();
                int i24 = 0;
                while (i24 < size7) {
                    Object obj3 = arrayList3.get(i24);
                    i24++;
                    if (obj3 == null) {
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            rr4 rr4Var8 = (rr4) it.next();
                            throw null;
                        }
                    } else {
                        vm1.h();
                        return;
                    }
                }
                int size8 = arrayList3.size();
                int i25 = 0;
                while (i25 < size8) {
                    Object obj4 = arrayList3.get(i25);
                    i25++;
                    if (obj4 == null) {
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            rr4 rr4Var9 = (rr4) it2.next();
                            throw null;
                        }
                    } else {
                        vm1.h();
                        return;
                    }
                }
            }
        }
        for (int i26 = i; i26 < i2; i26++) {
            uf0 uf0Var3 = (uf0) arrayList.get(i26);
            if (booleanValue2) {
                for (int size9 = uf0Var3.a.size() - 1; size9 >= 0; size9--) {
                    rr4 rr4Var10 = ((qs4) uf0Var3.a.get(size9)).b;
                    if (rr4Var10 != null) {
                        g(rr4Var10).j();
                    }
                }
            } else {
                ArrayList arrayList11 = uf0Var3.a;
                int size10 = arrayList11.size();
                int i27 = 0;
                while (i27 < size10) {
                    Object obj5 = arrayList11.get(i27);
                    i27++;
                    rr4 rr4Var11 = ((qs4) obj5).b;
                    if (rr4Var11 != null) {
                        g(rr4Var11).j();
                    }
                }
            }
        }
        P(this.v, true);
        int i28 = i;
        Iterator it3 = f(arrayList, i28, i2).iterator();
        while (it3.hasNext()) {
            nx2 nx2Var = (nx2) it3.next();
            nx2Var.e = booleanValue2;
            synchronized (nx2Var.b) {
                nx2Var.f();
                ArrayList arrayList12 = nx2Var.b;
                ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                if (!listIterator.hasPrevious()) {
                    nx2Var.f = false;
                } else {
                    ((kwa) listIterator.previous()).getClass();
                    throw null;
                }
            }
            nx2Var.c();
        }
        while (i28 < i2) {
            uf0 uf0Var4 = (uf0) arrayList.get(i28);
            if (((Boolean) arrayList2.get(i28)).booleanValue() && uf0Var4.s >= 0) {
                uf0Var4.s = -1;
            }
            if (uf0Var4.p != null) {
                for (int i29 = 0; i29 < uf0Var4.p.size(); i29++) {
                    ((Runnable) uf0Var4.p.get(i29)).run();
                }
                uf0Var4.p = null;
            }
            i28++;
        }
        if (z9 && arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            vm1.h();
        }
    }

    public final rr4 C(int i) {
        oaa oaaVar = this.c;
        ArrayList arrayList = (ArrayList) oaaVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rr4 rr4Var = (rr4) arrayList.get(size);
            if (rr4Var != null && rr4Var.T == i) {
                return rr4Var;
            }
        }
        for (ns4 ns4Var : ((HashMap) oaaVar.c).values()) {
            if (ns4Var != null) {
                rr4 rr4Var2 = ns4Var.c;
                if (rr4Var2.T == i) {
                    return rr4Var2;
                }
            }
        }
        return null;
    }

    public final rr4 D(String str) {
        oaa oaaVar = this.c;
        ArrayList arrayList = (ArrayList) oaaVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rr4 rr4Var = (rr4) arrayList.get(size);
            if (rr4Var != null && str.equals(rr4Var.V)) {
                return rr4Var;
            }
        }
        for (ns4 ns4Var : ((HashMap) oaaVar.c).values()) {
            if (ns4Var != null) {
                rr4 rr4Var2 = ns4Var.c;
                if (str.equals(rr4Var2.V)) {
                    return rr4Var2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            nx2 nx2Var = (nx2) it.next();
            if (nx2Var.f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                nx2Var.f = false;
                nx2Var.c();
            }
        }
    }

    public final ViewGroup G(rr4 rr4Var) {
        ViewGroup viewGroup = rr4Var.b0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rr4Var.U > 0 && this.x.z()) {
            View x = this.x.x(rr4Var.U);
            if (x instanceof ViewGroup) {
                return (ViewGroup) x;
            }
            return null;
        }
        return null;
    }

    public final bs4 H() {
        rr4 rr4Var = this.y;
        if (rr4Var != null) {
            return rr4Var.P.H();
        }
        return this.A;
    }

    public final cne I() {
        rr4 rr4Var = this.y;
        if (rr4Var != null) {
            return rr4Var.P.I();
        }
        return this.B;
    }

    public final void J(rr4 rr4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + rr4Var);
        }
        if (!rr4Var.W) {
            rr4Var.W = true;
            rr4Var.f0 = true ^ rr4Var.f0;
            b0(rr4Var);
        }
    }

    public final boolean M() {
        rr4 rr4Var = this.y;
        if (rr4Var != null) {
            if (rr4Var.Q != null && rr4Var.G && rr4Var.o().M()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void P(int i, boolean z) {
        tr4 tr4Var;
        if (this.w == null && i != -1) {
            vs.k("No activity");
        } else if (z || i != this.v) {
            this.v = i;
            oaa oaaVar = this.c;
            HashMap hashMap = (HashMap) oaaVar.c;
            ArrayList arrayList = (ArrayList) oaaVar.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ns4 ns4Var = (ns4) hashMap.get(((rr4) obj).e);
                if (ns4Var != null) {
                    ns4Var.j();
                }
            }
            for (ns4 ns4Var2 : hashMap.values()) {
                if (ns4Var2 != null) {
                    ns4Var2.j();
                    rr4 rr4Var = ns4Var2.c;
                    if (rr4Var.H && !rr4Var.s()) {
                        oaaVar.I(ns4Var2);
                    }
                }
            }
            d0();
            if (this.G && (tr4Var = this.w) != null && this.v == 7) {
                tr4Var.C.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void Q() {
        if (this.w != null) {
            this.H = false;
            this.I = false;
            this.O.C = false;
            for (rr4 rr4Var : this.c.z()) {
                if (rr4Var != null) {
                    rr4Var.R.Q();
                }
            }
        }
    }

    public final boolean R() {
        A(false);
        z(true);
        rr4 rr4Var = this.z;
        if (rr4Var != null && rr4Var.m().R()) {
            return true;
        }
        boolean S = S(this.L, this.M, -1, 0);
        if (S) {
            this.b = true;
            try {
                U(this.L, this.M);
            } finally {
                d();
            }
        }
        f0();
        v();
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return S;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    uf0 uf0Var = (uf0) this.d.get(size);
                    if (i >= 0 && i == uf0Var.s) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        uf0 uf0Var2 = (uf0) this.d.get(i3 - 1);
                        if (i < 0 || i != uf0Var2.s) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.d.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((uf0) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(rr4 rr4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + rr4Var + " nesting=" + rr4Var.O);
        }
        boolean s = rr4Var.s();
        if (rr4Var.X && s) {
            return;
        }
        oaa oaaVar = this.c;
        synchronized (((ArrayList) oaaVar.b)) {
            ((ArrayList) oaaVar.b).remove(rr4Var);
        }
        rr4Var.G = false;
        if (L(rr4Var)) {
            this.G = true;
        }
        rr4Var.H = true;
        b0(rr4Var);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((uf0) arrayList.get(i)).o) {
                        if (i2 != i) {
                            B(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((uf0) arrayList.get(i2)).o) {
                                i2++;
                            }
                        }
                        B(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    B(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            vs.k("Internal error with the back stack records");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [qs4, java.lang.Object] */
    public final void V(Bundle bundle) {
        s6f s6fVar;
        int i;
        boolean z;
        int i2;
        Bundle bundle2;
        ns4 ns4Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.w.d.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.w.d.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        oaa oaaVar = this.c;
        HashMap hashMap2 = (HashMap) oaaVar.d;
        HashMap hashMap3 = (HashMap) oaaVar.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        is4 is4Var = (is4) bundle.getParcelable("state");
        if (is4Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = is4Var.a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            s6fVar = this.o;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            Bundle P = oaaVar.P((String) obj, null);
            if (P != null) {
                rr4 rr4Var = (rr4) this.O.b.get(((ms4) P.getParcelable("state")).b);
                if (rr4Var != null) {
                    if (K(2)) {
                        i2 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + rr4Var);
                    } else {
                        i2 = 2;
                    }
                    ns4Var = new ns4(s6fVar, oaaVar, rr4Var, P);
                    bundle2 = P;
                } else {
                    i2 = 2;
                    bundle2 = P;
                    ns4Var = new ns4(this.o, this.c, this.w.d.getClassLoader(), H(), P);
                }
                rr4 rr4Var2 = ns4Var.c;
                rr4Var2.b = bundle2;
                rr4Var2.P = this;
                if (K(i2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + rr4Var2.e + "): " + rr4Var2);
                }
                ns4Var.l(this.w.d.getClassLoader());
                oaaVar.H(ns4Var);
                ns4Var.e = this.v;
            }
        }
        js4 js4Var = this.O;
        js4Var.getClass();
        ArrayList arrayList2 = new ArrayList(js4Var.b.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            rr4 rr4Var3 = (rr4) obj2;
            if (hashMap3.get(rr4Var3.e) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + rr4Var3 + " that was not found in the set of active Fragments " + is4Var.a);
                }
                this.O.h(rr4Var3);
                rr4Var3.P = this;
                ns4 ns4Var2 = new ns4(s6fVar, oaaVar, rr4Var3);
                ns4Var2.e = 1;
                ns4Var2.j();
                rr4Var3.H = true;
                ns4Var2.j();
            }
        }
        ArrayList arrayList3 = is4Var.b;
        ((ArrayList) oaaVar.b).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                rr4 s = oaaVar.s(str3);
                if (s != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + s);
                    }
                    oaaVar.d(s);
                } else {
                    vs.k(hl5.n("No instantiated fragment for (", str3, ")"));
                    return;
                }
            }
        }
        if (is4Var.c != null) {
            this.d = new ArrayList(is4Var.c.length);
            int i6 = 0;
            while (true) {
                vf0[] vf0VarArr = is4Var.c;
                if (i6 >= vf0VarArr.length) {
                    break;
                }
                vf0 vf0Var = vf0VarArr[i6];
                ArrayList arrayList4 = vf0Var.b;
                uf0 uf0Var = new uf0(this);
                int[] iArr = vf0Var.a;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    ?? obj4 = new Object();
                    int i9 = i7 + 1;
                    obj4.a = iArr[i7];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + uf0Var + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    obj4.h = kn6.values()[vf0Var.c[i8]];
                    obj4.i = kn6.values()[vf0Var.d[i8]];
                    int i10 = i7 + 2;
                    if (iArr[i9] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    obj4.c = z;
                    int i11 = iArr[i10];
                    obj4.d = i11;
                    int i12 = iArr[i7 + 3];
                    obj4.e = i12;
                    int i13 = i7 + 5;
                    int i14 = iArr[i7 + 4];
                    obj4.f = i14;
                    i7 += 6;
                    int[] iArr2 = iArr;
                    int i15 = iArr2[i13];
                    obj4.g = i15;
                    uf0Var.b = i11;
                    uf0Var.c = i12;
                    uf0Var.d = i14;
                    uf0Var.e = i15;
                    uf0Var.b(obj4);
                    i8++;
                    iArr = iArr2;
                }
                uf0Var.f = vf0Var.e;
                uf0Var.h = vf0Var.f;
                uf0Var.g = true;
                uf0Var.i = vf0Var.D;
                uf0Var.j = vf0Var.E;
                uf0Var.k = vf0Var.F;
                uf0Var.l = vf0Var.G;
                uf0Var.m = vf0Var.H;
                uf0Var.n = vf0Var.I;
                uf0Var.o = vf0Var.J;
                uf0Var.s = vf0Var.C;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    String str4 = (String) arrayList4.get(i16);
                    if (str4 != null) {
                        ((qs4) uf0Var.a.get(i16)).b = oaaVar.s(str4);
                    }
                }
                uf0Var.c(1);
                if (K(2)) {
                    StringBuilder s2 = hl5.s("restoreAllState: back stack #", " (index ", i6);
                    s2.append(uf0Var.s);
                    s2.append("): ");
                    s2.append(uf0Var);
                    Log.v("FragmentManager", s2.toString());
                    PrintWriter printWriter = new PrintWriter(new iw6());
                    uf0Var.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(uf0Var);
                i6++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = new ArrayList();
        }
        this.k.set(is4Var.d);
        String str5 = is4Var.e;
        if (str5 != null) {
            rr4 s3 = oaaVar.s(str5);
            this.z = s3;
            r(s3);
        }
        ArrayList arrayList5 = is4Var.f;
        if (arrayList5 != null) {
            for (int i17 = i; i17 < arrayList5.size(); i17++) {
                this.l.put((String) arrayList5.get(i17), (wf0) is4Var.C.get(i17));
            }
        }
        this.F = new ArrayDeque(is4Var.D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.os.Parcelable, java.lang.Object, is4] */
    public final Bundle W() {
        int i;
        ArrayList arrayList;
        vf0[] vf0VarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.H = true;
        this.O.C = true;
        oaa oaaVar = this.c;
        oaaVar.getClass();
        HashMap hashMap = (HashMap) oaaVar.c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ns4 ns4Var = (ns4) it.next();
            if (ns4Var != null) {
                rr4 rr4Var = ns4Var.c;
                String str = rr4Var.e;
                Bundle bundle3 = new Bundle();
                rr4 rr4Var2 = ns4Var.c;
                if (rr4Var2.a == -1 && (bundle = rr4Var2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new ms4(rr4Var2));
                if (rr4Var2.a > 0) {
                    Bundle bundle4 = new Bundle();
                    rr4Var2.C(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    ns4Var.a.B(rr4Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    rr4Var2.m0.t(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle W = rr4Var2.R.W();
                    if (!W.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", W);
                    }
                    SparseArray<? extends Parcelable> sparseArray = rr4Var2.c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = rr4Var2.d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = rr4Var2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                oaaVar.P(str, bundle3);
                arrayList2.add(rr4Var.e);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + rr4Var + ": " + rr4Var.b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.c.d;
        if (hashMap2.isEmpty()) {
            if (K(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle2;
            }
        } else {
            oaa oaaVar2 = this.c;
            synchronized (((ArrayList) oaaVar2.b)) {
                try {
                    if (((ArrayList) oaaVar2.b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) oaaVar2.b).size());
                        ArrayList arrayList3 = (ArrayList) oaaVar2.b;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            rr4 rr4Var3 = (rr4) obj;
                            arrayList.add(rr4Var3.e);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + rr4Var3.e + "): " + rr4Var3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                vf0VarArr = new vf0[size2];
                for (i = 0; i < size2; i++) {
                    vf0VarArr[i] = new vf0((uf0) this.d.get(i));
                    if (K(2)) {
                        StringBuilder s = hl5.s("saveAllState: adding back stack #", ": ", i);
                        s.append(this.d.get(i));
                        Log.v("FragmentManager", s.toString());
                    }
                }
            } else {
                vf0VarArr = null;
            }
            ?? obj2 = new Object();
            obj2.e = null;
            ArrayList arrayList4 = new ArrayList();
            obj2.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj2.C = arrayList5;
            obj2.a = arrayList2;
            obj2.b = arrayList;
            obj2.c = vf0VarArr;
            obj2.d = this.k.get();
            rr4 rr4Var4 = this.z;
            if (rr4Var4 != null) {
                obj2.e = rr4Var4.e;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            obj2.D = new ArrayList(this.F);
            bundle2.putParcelable("state", obj2);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(s21.m("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(s21.m("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        }
        return bundle2;
    }

    public final void X() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.e.removeCallbacks(this.P);
                    this.w.e.post(this.P);
                    f0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(rr4 rr4Var, boolean z) {
        ViewGroup G = G(rr4Var);
        if (G != null && (G instanceof wr4)) {
            ((wr4) G).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void Z(rr4 rr4Var, kn6 kn6Var) {
        if (rr4Var == this.c.s(rr4Var.e) && (rr4Var.Q == null || rr4Var.P == this)) {
            rr4Var.i0 = kn6Var;
        } else {
            vm1.g("Fragment ", rr4Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final ns4 a(rr4 rr4Var) {
        String str = rr4Var.h0;
        if (str != null) {
            ps4.c(rr4Var, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + rr4Var);
        }
        ns4 g = g(rr4Var);
        rr4Var.P = this;
        oaa oaaVar = this.c;
        oaaVar.H(g);
        if (!rr4Var.X) {
            oaaVar.d(rr4Var);
            rr4Var.H = false;
            rr4Var.f0 = false;
            if (L(rr4Var)) {
                this.G = true;
            }
        }
        return g;
    }

    public final void a0(rr4 rr4Var) {
        if (rr4Var != null) {
            if (rr4Var != this.c.s(rr4Var.e) || (rr4Var.Q != null && rr4Var.P != this)) {
                vm1.g("Fragment ", rr4Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        rr4 rr4Var2 = this.z;
        this.z = rr4Var;
        r(rr4Var2);
        r(this.z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(tr4 tr4Var, obe obeVar, rr4 rr4Var) {
        String str;
        tr4 tr4Var2;
        if (this.w == null) {
            this.w = tr4Var;
            this.x = obeVar;
            this.y = rr4Var;
            CopyOnWriteArrayList copyOnWriteArrayList = this.p;
            if (rr4Var != 0) {
                copyOnWriteArrayList.add(new cs4(rr4Var));
            } else if (tr4Var != null) {
                copyOnWriteArrayList.add(tr4Var);
            }
            if (this.y != null) {
                f0();
            }
            if (tr4Var != null) {
                tb8 b = tr4Var.C.b();
                this.g = b;
                if (rr4Var != 0) {
                    tr4Var2 = rr4Var;
                } else {
                    tr4Var2 = tr4Var;
                }
                b.a(this.j, tr4Var2);
            }
            boolean z = false;
            if (rr4Var != 0) {
                js4 js4Var = rr4Var.P.O;
                HashMap hashMap = js4Var.c;
                js4 js4Var2 = (js4) hashMap.get(rr4Var.e);
                if (js4Var2 == null) {
                    js4Var2 = new js4(js4Var.e);
                    hashMap.put(rr4Var.e, js4Var2);
                }
                this.O = js4Var2;
            } else if (tr4Var != null) {
                qdd i = tr4Var.C.i();
                ob2 ob2Var = ob2.b;
                ob2Var.getClass();
                odd oddVar = new odd(i, js4.D, ob2Var);
                gi1 a = cm9.a(js4.class);
                String f = a.f();
                if (f != null) {
                    this.O = (js4) oddVar.a(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                } else {
                    vs.m("Local and anonymous classes can not be ViewModels");
                    return;
                }
            } else {
                this.O = new js4(false);
            }
            js4 js4Var3 = this.O;
            js4Var3.C = (this.H || this.I) ? true : true;
            this.c.e = js4Var3;
            tr4 tr4Var3 = this.w;
            if (tr4Var3 != null && rr4Var == 0) {
                s26 j = tr4Var3.j();
                j.L("android:support:fragments", new ut1(this, 3));
                Bundle q = j.q("android:support:fragments");
                if (q != null) {
                    V(q);
                }
            }
            tr4 tr4Var4 = this.w;
            if (tr4Var4 != null) {
                zt1 zt1Var = tr4Var4.C.E;
                if (rr4Var != 0) {
                    str = s21.q(new StringBuilder(), rr4Var.e, ":");
                } else {
                    str = "";
                }
                String concat = "FragmentManager:".concat(str);
                this.C = zt1Var.c(concat.concat("StartActivityForResult"), new b6(5), new uwd(this, 21));
                this.D = zt1Var.c(concat.concat("StartIntentSenderForResult"), new b6(8), new mce(this));
                this.E = zt1Var.c(concat.concat("RequestPermissions"), new b6(3), new n07(this, 18));
            }
            tr4 tr4Var5 = this.w;
            if (tr4Var5 != null) {
                ur4 ur4Var = tr4Var5.C;
                zr4 zr4Var = this.q;
                zr4Var.getClass();
                ur4Var.F.add(zr4Var);
            }
            tr4 tr4Var6 = this.w;
            if (tr4Var6 != null) {
                ur4 ur4Var2 = tr4Var6.C;
                zr4 zr4Var2 = this.r;
                zr4Var2.getClass();
                ur4Var2.G.add(zr4Var2);
            }
            tr4 tr4Var7 = this.w;
            if (tr4Var7 != null) {
                ur4 ur4Var3 = tr4Var7.C;
                zr4 zr4Var3 = this.s;
                zr4Var3.getClass();
                ur4Var3.I.add(zr4Var3);
            }
            tr4 tr4Var8 = this.w;
            if (tr4Var8 != null) {
                ur4 ur4Var4 = tr4Var8.C;
                zr4 zr4Var4 = this.t;
                zr4Var4.getClass();
                ur4Var4.J.add(zr4Var4);
            }
            tr4 tr4Var9 = this.w;
            if (tr4Var9 != null && rr4Var == 0) {
                ur4 ur4Var5 = tr4Var9.C;
                as4 as4Var = this.u;
                as4Var.getClass();
                zg4 zg4Var = ur4Var5.c;
                ((CopyOnWriteArrayList) zg4Var.c).add(as4Var);
                ((qt1) zg4Var.b).run();
                return;
            }
            return;
        }
        vs.k("Already attached");
    }

    public final void b0(rr4 rr4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup G = G(rr4Var);
        if (G != null) {
            pr4 pr4Var = rr4Var.e0;
            boolean z = false;
            if (pr4Var == null) {
                i = 0;
            } else {
                i = pr4Var.b;
            }
            if (pr4Var == null) {
                i2 = 0;
            } else {
                i2 = pr4Var.c;
            }
            int i5 = i2 + i;
            if (pr4Var == null) {
                i3 = 0;
            } else {
                i3 = pr4Var.d;
            }
            int i6 = i3 + i5;
            if (pr4Var == null) {
                i4 = 0;
            } else {
                i4 = pr4Var.e;
            }
            if (i4 + i6 > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, rr4Var);
                }
                rr4 rr4Var2 = (rr4) G.getTag(R.id.visible_removing_fragment_view_tag);
                pr4 pr4Var2 = rr4Var.e0;
                if (pr4Var2 != null) {
                    z = pr4Var2.a;
                }
                if (rr4Var2.e0 != null) {
                    rr4Var2.l().a = z;
                }
            }
        }
    }

    public final void c(rr4 rr4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + rr4Var);
        }
        if (rr4Var.X) {
            rr4Var.X = false;
            if (!rr4Var.G) {
                this.c.d(rr4Var);
                if (K(2)) {
                    Log.v("FragmentManager", "add from attach: " + rr4Var);
                }
                if (L(rr4Var)) {
                    this.G = true;
                }
            }
        }
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0() {
        ArrayList w = this.c.w();
        int size = w.size();
        int i = 0;
        while (i < size) {
            Object obj = w.get(i);
            i++;
            ns4 ns4Var = (ns4) obj;
            rr4 rr4Var = ns4Var.c;
            if (rr4Var.c0) {
                if (this.b) {
                    this.K = true;
                } else {
                    rr4Var.c0 = false;
                    ns4Var.j();
                }
            }
        }
    }

    public final HashSet e() {
        nx2 nx2Var;
        HashSet hashSet = new HashSet();
        ArrayList w = this.c.w();
        int size = w.size();
        int i = 0;
        while (i < size) {
            Object obj = w.get(i);
            i++;
            ViewGroup viewGroup = ((ns4) obj).c.b0;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof nx2) {
                    nx2Var = (nx2) tag;
                } else {
                    nx2Var = new nx2(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, nx2Var);
                }
                hashSet.add(nx2Var);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new iw6());
        tr4 tr4Var = this.w;
        if (tr4Var != null) {
            try {
                tr4Var.C.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                w("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw illegalStateException;
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        nx2 nx2Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((uf0) arrayList.get(i)).a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                rr4 rr4Var = ((qs4) obj).b;
                if (rr4Var != null && (viewGroup = rr4Var.b0) != null) {
                    I().getClass();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof nx2) {
                        nx2Var = (nx2) tag;
                    } else {
                        nx2Var = new nx2(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, nx2Var);
                    }
                    hashSet.add(nx2Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0() {
        int i;
        synchronized (this.a) {
            try {
                boolean z = true;
                if (!this.a.isEmpty()) {
                    this.j.h(true);
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                int size = this.d.size();
                if (this.h != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (size + i <= 0 || !O(this.y)) {
                    z = false;
                }
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.h(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ns4 g(rr4 rr4Var) {
        String str = rr4Var.e;
        oaa oaaVar = this.c;
        ns4 ns4Var = (ns4) ((HashMap) oaaVar.c).get(str);
        if (ns4Var != null) {
            return ns4Var;
        }
        ns4 ns4Var2 = new ns4(this.o, oaaVar, rr4Var);
        ns4Var2.l(this.w.d.getClassLoader());
        ns4Var2.e = this.v;
        return ns4Var2;
    }

    public final void h(rr4 rr4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + rr4Var);
        }
        if (!rr4Var.X) {
            rr4Var.X = true;
            if (rr4Var.G) {
                if (K(2)) {
                    Log.v("FragmentManager", "remove from detach: " + rr4Var);
                }
                oaa oaaVar = this.c;
                synchronized (((ArrayList) oaaVar.b)) {
                    ((ArrayList) oaaVar.b).remove(rr4Var);
                }
                rr4Var.G = false;
                if (L(rr4Var)) {
                    this.G = true;
                }
                b0(rr4Var);
            }
        }
    }

    public final void i(boolean z) {
        if (z && this.w != null) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (rr4 rr4Var : this.c.z()) {
            if (rr4Var != null) {
                rr4Var.a0 = true;
                if (z) {
                    rr4Var.R.i(true);
                }
            }
        }
    }

    public final boolean j() {
        boolean z;
        if (this.v >= 1) {
            for (rr4 rr4Var : this.c.z()) {
                if (rr4Var != null) {
                    if (!rr4Var.W) {
                        z = rr4Var.R.j();
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z;
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (rr4 rr4Var : this.c.z()) {
            if (rr4Var != null && N(rr4Var)) {
                if (!rr4Var.W) {
                    z = rr4Var.R.k();
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(rr4Var);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                rr4 rr4Var2 = (rr4) this.e.get(i);
                if (arrayList == null || !arrayList.contains(rr4Var2)) {
                    rr4Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void l() {
        boolean z = true;
        this.J = true;
        A(true);
        x();
        tr4 tr4Var = this.w;
        oaa oaaVar = this.c;
        if (tr4Var != null) {
            z = ((js4) oaaVar.e).f;
        } else {
            ur4 ur4Var = tr4Var.d;
            if (ur4Var != null) {
                z = true ^ ur4Var.isChangingConfigurations();
            }
        }
        if (z) {
            for (wf0 wf0Var : this.l.values()) {
                ArrayList arrayList = wf0Var.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((js4) oaaVar.e).f((String) obj, false);
                }
            }
        }
        u(-1);
        tr4 tr4Var2 = this.w;
        if (tr4Var2 != null) {
            ur4 ur4Var2 = tr4Var2.C;
            zr4 zr4Var = this.r;
            zr4Var.getClass();
            ur4Var2.G.remove(zr4Var);
        }
        tr4 tr4Var3 = this.w;
        if (tr4Var3 != null) {
            ur4 ur4Var3 = tr4Var3.C;
            zr4 zr4Var2 = this.q;
            zr4Var2.getClass();
            ur4Var3.F.remove(zr4Var2);
        }
        tr4 tr4Var4 = this.w;
        if (tr4Var4 != null) {
            ur4 ur4Var4 = tr4Var4.C;
            zr4 zr4Var3 = this.s;
            zr4Var3.getClass();
            ur4Var4.I.remove(zr4Var3);
        }
        tr4 tr4Var5 = this.w;
        if (tr4Var5 != null) {
            ur4 ur4Var5 = tr4Var5.C;
            zr4 zr4Var4 = this.t;
            zr4Var4.getClass();
            ur4Var5.J.remove(zr4Var4);
        }
        tr4 tr4Var6 = this.w;
        if (tr4Var6 != null && this.y == null) {
            ur4 ur4Var6 = tr4Var6.C;
            as4 as4Var = this.u;
            as4Var.getClass();
            zg4 zg4Var = ur4Var6.c;
            ((CopyOnWriteArrayList) zg4Var.c).remove(as4Var);
            if (((HashMap) zg4Var.d).remove(as4Var) == null) {
                ((qt1) zg4Var.b).run();
            } else {
                vm1.h();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.j.g();
            this.g = null;
        }
        o6 o6Var = this.C;
        if (o6Var != null) {
            o6Var.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z) {
        if (z && this.w != null) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (rr4 rr4Var : this.c.z()) {
            if (rr4Var != null) {
                rr4Var.a0 = true;
                if (z) {
                    rr4Var.R.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (rr4 rr4Var : this.c.z()) {
            if (rr4Var != null && z) {
                rr4Var.R.n(true);
            }
        }
    }

    public final void o() {
        ArrayList x = this.c.x();
        int size = x.size();
        int i = 0;
        while (i < size) {
            Object obj = x.get(i);
            i++;
            rr4 rr4Var = (rr4) obj;
            if (rr4Var != null) {
                rr4Var.r();
                rr4Var.R.o();
            }
        }
    }

    public final boolean p() {
        boolean z;
        if (this.v >= 1) {
            for (rr4 rr4Var : this.c.z()) {
                if (rr4Var != null) {
                    if (!rr4Var.W) {
                        z = rr4Var.R.p();
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v >= 1) {
            for (rr4 rr4Var : this.c.z()) {
                if (rr4Var != null && !rr4Var.W) {
                    rr4Var.R.q();
                }
            }
        }
    }

    public final void r(rr4 rr4Var) {
        if (rr4Var != null) {
            if (rr4Var == this.c.s(rr4Var.e)) {
                rr4Var.P.getClass();
                boolean O = O(rr4Var);
                Boolean bool = rr4Var.F;
                if (bool == null || bool.booleanValue() != O) {
                    rr4Var.F = Boolean.valueOf(O);
                    hs4 hs4Var = rr4Var.R;
                    hs4Var.f0();
                    hs4Var.r(hs4Var.z);
                }
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.w != null) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (rr4 rr4Var : this.c.z()) {
            if (rr4Var != null && z) {
                rr4Var.R.s(true);
            }
        }
    }

    public final boolean t() {
        boolean z;
        if (this.v < 1) {
            return false;
        }
        boolean z2 = false;
        for (rr4 rr4Var : this.c.z()) {
            if (rr4Var != null && N(rr4Var)) {
                if (!rr4Var.W) {
                    z = rr4Var.R.t();
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Token.CASE);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        rr4 rr4Var = this.y;
        if (rr4Var != null) {
            sb.append(rr4Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            tr4 tr4Var = this.w;
            if (tr4Var != null) {
                sb.append(tr4Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (ns4 ns4Var : ((HashMap) this.c.c).values()) {
                if (ns4Var != null) {
                    ns4Var.e = i;
                }
            }
            P(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((nx2) it.next()).d();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            d0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String u = nk2.u(str, "    ");
        oaa oaaVar = this.c;
        ArrayList arrayList = (ArrayList) oaaVar.b;
        String u2 = nk2.u(str, "    ");
        HashMap hashMap = (HashMap) oaaVar.c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (ns4 ns4Var : hashMap.values()) {
                printWriter.print(str);
                if (ns4Var != null) {
                    rr4 rr4Var = ns4Var.c;
                    printWriter.println(rr4Var);
                    rr4Var.h(u2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((rr4) arrayList.get(i)).toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((rr4) this.e.get(i2)).toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                uf0 uf0Var = (uf0) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(uf0Var.toString());
                uf0Var.g(u, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println((es4) this.a.get(i4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((nx2) it.next()).d();
        }
    }

    public final void y(es4 es4Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    vs.k("FragmentManager has been destroyed");
                    return;
                } else {
                    vs.k("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (this.H || this.I) {
                vs.k("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (z) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.a.add(es4Var);
                X();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (!this.b) {
            if (this.w == null) {
                if (this.J) {
                    vs.k("FragmentManager has been destroyed");
                    return;
                } else {
                    vs.k("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (Looper.myLooper() == this.w.e.getLooper()) {
                if (!z && (this.H || this.I)) {
                    vs.k("Can not perform this action after onSaveInstanceState");
                    return;
                } else if (this.L == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                    return;
                } else {
                    return;
                }
            } else {
                vs.k("Must be called from main thread of fragment host");
                return;
            }
        }
        vs.k("FragmentManager is already executing transactions");
    }
}
