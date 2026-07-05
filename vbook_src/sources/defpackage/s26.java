package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.vbook.android.R;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.Undefined;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s26  reason: default package */
/* loaded from: classes.dex */
public final class s26 implements l6b, nw6, pxa, h61, qe8, l29, bl0, oa4, na4, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public s26(int i) {
        this.a = i;
        ks3 ks3Var = ks3.a;
        switch (i) {
            case 6:
                this.b = dza.a(null);
                this.c = dza.a(ks3Var);
                return;
            case 8:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                return;
            case 11:
                this.c = new float[64];
                return;
            case 13:
                this.b = new Object();
                this.c = new sw7();
                return;
            case 17:
                Context enter = Context.enter();
                enter.setInterpretedMode(true);
                enter.setLanguageVersion(Context.VERSION_ES6);
                enter.getWrapFactory().setJavaPrimitiveWrap(false);
                this.b = enter;
                this.c = enter.initSafeStandardObjects();
                return;
            case 27:
                hvc hvcVar = new hvc(0, false);
                ora oraVar = new ora();
                oraVar.addAll(ks3Var);
                hvcVar.b = oraVar;
                ora oraVar2 = new ora();
                oraVar2.addAll(ks3Var);
                hvcVar.c = oraVar2;
                this.b = hvcVar;
                this.c = yae.z(null);
                return;
            case 29:
                this.b = new v28(5);
                this.c = new ypa(16);
                return;
            default:
                drc drcVar = fca.f;
                Float valueOf = Float.valueOf((float) nae.e);
                this.c = new es(drcVar, valueOf, (js) drcVar.a.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
        }
    }

    public boolean A() {
        if (((StringBuilder) this.c) == null && ((String) this.b) == null) {
            return false;
        }
        return true;
    }

    public boolean B() {
        boolean z;
        if (((Number) ((es) this.c).b.getValue()).floatValue() == nae.e) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v6, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v2, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(java.lang.String r14, java.lang.String r15, float r16, float r17, defpackage.n42 r18) {
        /*
            r13 = this;
            r0 = r18
            boolean r2 = r0 instanceof defpackage.zv8
            if (r2 == 0) goto L16
            r2 = r0
            zv8 r2 = (defpackage.zv8) r2
            int r3 = r2.D
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.D = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            zv8 r2 = new zv8
            r2.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f
            int r2 = r7.D
            r8 = 2
            r3 = 1
            r9 = 0
            n82 r10 = defpackage.n82.a
            if (r2 == 0) goto L4e
            if (r2 == r3) goto L3b
            if (r2 != r8) goto L35
            qw7 r1 = r7.c
            defpackage.hre.r(r0)     // Catch: java.lang.Throwable -> L32
            goto L90
        L32:
            r0 = move-exception
            goto L9b
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r9
        L3b:
            float r2 = r7.e
            float r3 = r7.d
            qw7 r4 = r7.c
            java.lang.String r5 = r7.b
            java.lang.String r6 = r7.a
            defpackage.hre.r(r0)
            r11 = r4
            r4 = r3
            r3 = r5
            r5 = r2
            r2 = r6
            goto L71
        L4e:
            defpackage.hre.r(r0)
            java.lang.Object r0 = r13.c
            sw7 r0 = (defpackage.sw7) r0
            r7.a = r14
            r7.b = r15
            r7.c = r0
            r5 = r16
            r7.d = r5
            r6 = r17
            r7.e = r6
            r7.D = r3
            java.lang.Object r3 = r0.o(r7)
            if (r3 != r10) goto L6c
            goto L8e
        L6c:
            r2 = r14
            r3 = r15
            r11 = r0
            r4 = r5
            r5 = r6
        L71:
            sw2 r0 = defpackage.ab3.a     // Catch: java.lang.Throwable -> L99
            ru2 r12 = defpackage.ru2.c     // Catch: java.lang.Throwable -> L99
            aw8 r0 = new aw8     // Catch: java.lang.Throwable -> L99
            r6 = 0
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L99
            r7.a = r9     // Catch: java.lang.Throwable -> L99
            r7.b = r9     // Catch: java.lang.Throwable -> L99
            r7.c = r11     // Catch: java.lang.Throwable -> L99
            r7.d = r4     // Catch: java.lang.Throwable -> L99
            r7.e = r5     // Catch: java.lang.Throwable -> L99
            r7.D = r8     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = defpackage.z87.E(r12, r0, r7)     // Catch: java.lang.Throwable -> L99
            if (r0 != r10) goto L8f
        L8e:
            return r10
        L8f:
            r1 = r11
        L90:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L32
            r0.getClass()     // Catch: java.lang.Throwable -> L32
            r1.q(r9)
            return r0
        L99:
            r0 = move-exception
            r1 = r11
        L9b:
            r1.q(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s26.C(java.lang.String, java.lang.String, float, float, n42):java.lang.Object");
    }

    public void D(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            s(i3);
            int[] iArr2 = (int[]) this.b;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.b, i, i3, -1);
            ArrayList arrayList = (ArrayList) this.c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    fya fyaVar = (fya) ((ArrayList) this.c).get(size);
                    int i4 = fyaVar.a;
                    if (i4 >= i) {
                        fyaVar.a = i4 + i2;
                    }
                }
            }
        }
    }

    public void E(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            s(i3);
            int[] iArr2 = (int[]) this.b;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.b;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    fya fyaVar = (fya) ((ArrayList) this.c).get(size);
                    int i4 = fyaVar.a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((ArrayList) this.c).remove(size);
                        } else {
                            fyaVar.a = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public dq8 F() {
        p88 p88Var = (p88) this.b;
        int i = p88Var.b;
        ljc ljcVar = (ljc) p88Var.c;
        p88Var.a++;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i2 = p88Var.a;
            if (i2 >= i) {
                break;
            }
            int c = ljcVar.c(i2) & 255;
            if (p88.y(c) || p88.x(c)) {
                break;
            }
            if (c == 35) {
                int i3 = p88Var.a;
                if (i3 + 2 < i) {
                    int h = cne.h(ljcVar.c(i3 + 1) & 255);
                    int h2 = cne.h(ljcVar.c(p88Var.a + 2) & 255);
                    if (h >= 0 && h2 >= 0) {
                        sb.append((char) ((h << 4) | h2));
                        p88Var.a += 3;
                    }
                }
            }
            sb.append((char) c);
            p88Var.a++;
        }
        return new dq8(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0366, code lost:
        if (r0.equals("null") == false) goto L246;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jq8 G() {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s26.G():jq8");
    }

    public jq8 H() {
        p88 p88Var = (p88) this.b;
        p88Var.B();
        int A = p88Var.A();
        if ((48 > A || A >= 58) && A != 43 && A != 45) {
            return G();
        }
        int i = p88Var.a;
        String J = J();
        Double B = q4b.B(J);
        if (B != null && k4b.f0(J, '.', 0, 6) < 0 && B.doubleValue() >= 0.0d) {
            int i2 = p88Var.a;
            p88Var.B();
            Integer R = r4b.R(10, J());
            if (R != null) {
                p88Var.B();
                int i3 = p88Var.a;
                if (J().equals("R")) {
                    return new gq8((int) B.doubleValue(), R.intValue());
                }
                p88Var.a = i3;
            }
            p88Var.a = i2;
            return new fq8(B.doubleValue());
        }
        p88Var.a = i;
        return G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(String str, ArrayList arrayList) {
        int i;
        char charAt;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        char c;
        long j;
        float intBitsToFloat;
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length && c16.l(str.charAt(i4), 32) <= 0) {
            i4++;
        }
        while (length > i4 && c16.l(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i5 = 0;
        while (i4 < length) {
            while (true) {
                i = i4 + 1;
                charAt = str.charAt(i4);
                int i6 = charAt | ' ';
                if ((i6 - 122) * (i6 - 97) > 0 || i6 == 101) {
                    if (i >= length) {
                        charAt = i3;
                    } else {
                        i4 = i;
                    }
                }
            }
            if (charAt != 0) {
                int i7 = charAt | ' ';
                if (i7 != 122) {
                    while (i < length && c16.l(str.charAt(i), 32) <= 0) {
                        i++;
                    }
                    if (i7 == 97) {
                        c = 1;
                    } else {
                        c = i3;
                    }
                    int i8 = i3;
                    do {
                        if (c != 0 && 3 <= i8 && i8 < 5) {
                            j = vve.j(i, Math.min(i + 1, length), str);
                        } else {
                            j = vve.j(i, length, str);
                        }
                        i = (int) (j >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                        if (!Float.isNaN(intBitsToFloat)) {
                            float[] fArr = (float[]) this.c;
                            int i9 = i8 + 1;
                            fArr[i8] = intBitsToFloat;
                            if (i9 >= fArr.length) {
                                float[] fArr2 = new float[i9 * 2];
                                this.c = fArr2;
                                System.arraycopy(fArr, i3, fArr2, i3, fArr.length);
                            }
                            i8 = i9;
                        }
                        while (i < length && (c16.l(str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                            i++;
                        }
                        if (i < length) {
                        }
                        i5 = i8;
                    } while (!Float.isNaN(intBitsToFloat));
                    i5 = i8;
                }
                float[] fArr3 = (float[]) this.c;
                int i10 = 2;
                switch (charAt) {
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                        i2 = i3;
                        int i11 = i5 - 7;
                        for (int i12 = i2; i12 <= i11; i12 += 7) {
                            float f = fArr3[i12];
                            float f2 = fArr3[i12 + 1];
                            float f3 = fArr3[i12 + 2];
                            if (Float.compare(fArr3[i12 + 3], nae.e) != 0) {
                                z = 1;
                            } else {
                                z = i2;
                            }
                            if (Float.compare(fArr3[i12 + 4], nae.e) != 0) {
                                z2 = 1;
                            } else {
                                z2 = i2;
                            }
                            arrayList.add(new mn8(f, f2, f3, z, z2, fArr3[i12 + 5], fArr3[i12 + 6]));
                        }
                        break;
                    case Token.ENUM_NEXT /* 67 */:
                        i2 = i3;
                        int i13 = i5 - 6;
                        for (int i14 = i2; i14 <= i13; i14 += 6) {
                            arrayList.add(new on8(fArr3[i14], fArr3[i14 + 1], fArr3[i14 + 2], fArr3[i14 + 3], fArr3[i14 + 4], fArr3[i14 + 5]));
                        }
                        break;
                    case Token.OBJECTLIT /* 72 */:
                        i2 = i3;
                        int i15 = i5 - 1;
                        for (int i16 = i2; i16 <= i15; i16++) {
                            arrayList.add(new pn8(fArr3[i16]));
                        }
                        break;
                    case Token.REF_CALL /* 76 */:
                        i2 = i3;
                        int i17 = i5 - 2;
                        for (int i18 = i2; i18 <= i17; i18 += 2) {
                            arrayList.add(new qn8(fArr3[i18], fArr3[i18 + 1]));
                        }
                        break;
                    case Token.REF_SPECIAL /* 77 */:
                        i2 = i3;
                        int i19 = i5 - 2;
                        if (i19 >= 0) {
                            arrayList.add(new rn8(fArr3[i2], fArr3[1]));
                            while (i10 <= i19) {
                                arrayList.add(new qn8(fArr3[i10], fArr3[i10 + 1]));
                                i10 += 2;
                            }
                            break;
                        }
                        break;
                    case Token.EXP /* 81 */:
                        i2 = i3;
                        int i20 = i5 - 4;
                        for (int i21 = i2; i21 <= i20; i21 += 4) {
                            arrayList.add(new sn8(fArr3[i21], fArr3[i21 + 1], fArr3[i21 + 2], fArr3[i21 + 3]));
                        }
                        break;
                    case Token.ESCXMLATTR /* 83 */:
                        i2 = i3;
                        int i22 = i5 - 4;
                        for (int i23 = i2; i23 <= i22; i23 += 4) {
                            arrayList.add(new tn8(fArr3[i23], fArr3[i23 + 1], fArr3[i23 + 2], fArr3[i23 + 3]));
                        }
                        break;
                    case Token.ESCXMLTEXT /* 84 */:
                        i2 = i3;
                        int i24 = i5 - 2;
                        for (int i25 = i2; i25 <= i24; i25 += 2) {
                            arrayList.add(new un8(fArr3[i25], fArr3[i25 + 1]));
                        }
                        break;
                    case Token.REF_NS_MEMBER /* 86 */:
                        i2 = i3;
                        int i26 = i5 - 1;
                        for (int i27 = i2; i27 <= i26; i27++) {
                            arrayList.add(new eo8(fArr3[i27]));
                        }
                        break;
                    case Token.TRY /* 90 */:
                    case Token.FUNCTION /* 122 */:
                        i2 = i3;
                        arrayList.add(nn8.c);
                        break;
                    case Token.RP /* 97 */:
                        int i28 = i5 - 7;
                        int i29 = i3;
                        while (i29 <= i28) {
                            float f4 = fArr3[i29];
                            float f5 = fArr3[i29 + 1];
                            float f6 = fArr3[i29 + 2];
                            char c2 = i3;
                            if (Float.compare(fArr3[i29 + 3], nae.e) != 0) {
                                z3 = 1;
                            } else {
                                z3 = c2;
                            }
                            if (Float.compare(fArr3[i29 + 4], nae.e) != 0) {
                                z4 = 1;
                            } else {
                                z4 = c2;
                            }
                            arrayList.add(new vn8(f4, f5, f6, z3, z4, fArr3[i29 + 5], fArr3[i29 + 6]));
                            i29 += 7;
                            i3 = c2;
                        }
                        i2 = i3;
                        break;
                    case 'c':
                        int i30 = i5 - 6;
                        for (int i31 = i3; i31 <= i30; i31 += 6) {
                            arrayList.add(new wn8(fArr3[i31], fArr3[i31 + 1], fArr3[i31 + 2], fArr3[i31 + 3], fArr3[i31 + 4], fArr3[i31 + 5]));
                        }
                        i2 = i3;
                        break;
                    case Token.ASSIGN_LOGICAL_AND /* 104 */:
                        int i32 = i5 - 1;
                        for (int i33 = i3; i33 <= i32; i33++) {
                            arrayList.add(new xn8(fArr3[i33]));
                        }
                        i2 = i3;
                        break;
                    case Token.ASSIGN_ADD /* 108 */:
                        int i34 = i5 - 2;
                        for (int i35 = i3; i35 <= i34; i35 += 2) {
                            arrayList.add(new yn8(fArr3[i35], fArr3[i35 + 1]));
                        }
                        i2 = i3;
                        break;
                    case Token.ASSIGN_SUB /* 109 */:
                        int i36 = i5 - 2;
                        if (i36 >= 0) {
                            arrayList.add(new zn8(fArr3[i3], fArr3[1]));
                            while (i10 <= i36) {
                                arrayList.add(new yn8(fArr3[i10], fArr3[i10 + 1]));
                                i10 += 2;
                            }
                        }
                        i2 = i3;
                        break;
                    case Token.ASSIGN_EXP /* 113 */:
                        int i37 = i5 - 4;
                        for (int i38 = i3; i38 <= i37; i38 += 4) {
                            arrayList.add(new ao8(fArr3[i38], fArr3[i38 + 1], fArr3[i38 + 2], fArr3[i38 + 3]));
                        }
                        i2 = i3;
                        break;
                    case Token.HOOK /* 115 */:
                        int i39 = i5 - 4;
                        for (int i40 = i3; i40 <= i39; i40 += 4) {
                            arrayList.add(new bo8(fArr3[i40], fArr3[i40 + 1], fArr3[i40 + 2], fArr3[i40 + 3]));
                        }
                        i2 = i3;
                        break;
                    case Token.COLON /* 116 */:
                        int i41 = i5 - 2;
                        for (int i42 = i3; i42 <= i41; i42 += 2) {
                            arrayList.add(new co8(fArr3[i42], fArr3[i42 + 1]));
                        }
                        i2 = i3;
                        break;
                    case Token.AND /* 118 */:
                        int i43 = i5 - 1;
                        for (int i44 = i3; i44 <= i43; i44++) {
                            arrayList.add(new do8(fArr3[i44]));
                        }
                        i2 = i3;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + charAt);
                }
                i4 = i;
                i3 = i2;
            } else {
                i4 = i;
            }
        }
    }

    public String J() {
        p88 p88Var = (p88) this.b;
        p88Var.B();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = p88Var.a;
            if (i >= p88Var.b) {
                break;
            }
            int c = ((ljc) p88Var.c).c(i) & 255;
            if (p88.y(c) || p88.x(c)) {
                break;
            }
            sb.append((char) c);
            p88Var.a++;
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(defpackage.d4c r29) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s26.K(d4c):void");
    }

    public void L(String str, ry9 ry9Var) {
        ry9Var.getClass();
        sy9 sy9Var = (sy9) this.b;
        synchronized (sy9Var.c) {
            if (!sy9Var.d.containsKey(str)) {
                sy9Var.d.put(str, ry9Var);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public void M(Object obj) {
        rz rzVar = (rz) ((rwa) this.c).k();
        if (rzVar.c < 12) {
            rzVar.addFirst(obj);
        }
    }

    public qya N(hmd hmdVar) {
        qya b;
        hmdVar.getClass();
        synchronized (this.c) {
            b = ((r18) this.b).b(hmdVar);
        }
        return b;
    }

    public void O() {
        StringBuilder sb = (StringBuilder) this.c;
        if (sb != null) {
            d4b.m(sb);
            this.c = null;
        }
        this.b = null;
    }

    public void P() {
        if (((sy9) this.b).h) {
            pk9 pk9Var = (pk9) this.c;
            if (pk9Var == null) {
                pk9Var = new pk9(this);
            }
            this.c = pk9Var;
            try {
                nl6.class.getDeclaredConstructor(null);
                pk9 pk9Var2 = (pk9) this.c;
                if (pk9Var2 != null) {
                    pk9Var2.a.add(nl6.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                String simpleName = nl6.class.getSimpleName();
                throw new IllegalArgumentException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e);
            }
        }
        vs.k("Can not perform this action after onSaveInstanceState");
    }

    public void Q(v26 v26Var) {
        int i = k26.b;
        ScriptableObject scriptableObject = (ScriptableObject) this.c;
        scriptableObject.getClass();
        k26 k26Var = new k26(v26Var);
        k26Var.activatePrototypeMap(2);
        k26Var.setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        k26Var.setParentScope(scriptableObject);
        ScriptableObject.defineProperty(scriptableObject, "JSBridge", k26Var, 2);
    }

    public void R() {
        iya iyaVar = (iya) this.b;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.c = new es(fca.f, Float.valueOf((float) nae.e), null, 60);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Type inference failed for: r0v13, types: [short[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable S(int[] r15, int r16, double r17, defpackage.n42 r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof defpackage.bw8
            if (r1 == 0) goto L15
            r1 = r0
            bw8 r1 = (defpackage.bw8) r1
            int r2 = r1.C
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.C = r2
            goto L1a
        L15:
            bw8 r1 = new bw8
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.e
            int r2 = r1.C
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            qw7 r14 = r1.b
            defpackage.hre.r(r0)     // Catch: java.lang.Throwable -> L2f
            goto L83
        L2f:
            r0 = move-exception
            goto L8f
        L32:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r14)
            return r5
        L38:
            double r7 = r1.d
            int r2 = r1.c
            qw7 r4 = r1.b
            int[] r9 = r1.a
            defpackage.hre.r(r0)
            r10 = r2
            r11 = r7
            goto L66
        L46:
            defpackage.hre.r(r0)
            java.lang.Object r0 = r14.c
            sw7 r0 = (defpackage.sw7) r0
            r1.a = r15
            r1.b = r0
            r7 = r16
            r1.c = r7
            r8 = r17
            r1.d = r8
            r1.C = r4
            java.lang.Object r4 = r0.o(r1)
            if (r4 != r6) goto L62
            goto L81
        L62:
            r4 = r0
            r10 = r7
            r11 = r8
            r9 = r15
        L66:
            sw2 r0 = defpackage.ab3.a     // Catch: java.lang.Throwable -> L8c
            ru2 r0 = defpackage.ru2.c     // Catch: java.lang.Throwable -> L8c
            pn0 r7 = new pn0     // Catch: java.lang.Throwable -> L89
            r13 = 0
            r8 = r14
            r7.<init>(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L89
            r1.a = r5     // Catch: java.lang.Throwable -> L89
            r1.b = r4     // Catch: java.lang.Throwable -> L89
            r1.c = r10     // Catch: java.lang.Throwable -> L89
            r1.d = r11     // Catch: java.lang.Throwable -> L89
            r1.C = r3     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = defpackage.z87.E(r0, r7, r1)     // Catch: java.lang.Throwable -> L89
            if (r0 != r6) goto L82
        L81:
            return r6
        L82:
            r14 = r4
        L83:
            short[] r0 = (short[]) r0     // Catch: java.lang.Throwable -> L2f
            r14.q(r5)
            return r0
        L89:
            r0 = move-exception
        L8a:
            r14 = r4
            goto L8f
        L8c:
            r0 = move-exception
            r14 = r0
            goto L8a
        L8f:
            r14.q(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s26.S(int[], int, double, n42):java.io.Serializable");
    }

    public qya T(hmd hmdVar) {
        qya e;
        synchronized (this.c) {
            e = ((r18) this.b).e(hmdVar);
        }
        return e;
    }

    public void U(float f, r13 r13Var, m82 m82Var) {
        xt4 xt4Var;
        if (f <= r13Var.L0(1.0f)) {
            return;
        }
        zqa f2 = pae.f();
        if (f2 != null) {
            xt4Var = f2.e();
        } else {
            xt4Var = null;
        }
        zqa h = pae.h(f2);
        try {
            float floatValue = ((Number) ((es) this.c).b.getValue()).floatValue();
            iya iyaVar = (iya) this.b;
            if (iyaVar != null) {
                iyaVar.cancel(null);
            }
            es esVar = (es) this.c;
            if (esVar.f) {
                this.c = yte.r(esVar, floatValue - f, nae.e, 30);
            } else {
                this.c = new es(fca.f, Float.valueOf(-f), null, 60);
            }
            this.b = z87.v(m82Var, null, null, new o54(this, (m42) null, 17), 3);
            pae.n(f2, h, xt4Var);
        } catch (Throwable th) {
            pae.n(f2, h, xt4Var);
            throw th;
        }
    }

    public String V() {
        StringBuilder sb = (StringBuilder) this.c;
        if (sb != null) {
            this.b = sb.toString();
            d4b.l(sb);
            this.c = null;
            String str = (String) this.b;
            str.getClass();
            return str;
        }
        String str2 = (String) this.b;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // defpackage.bl0
    public al0 a(s94 s94Var, long j) {
        int a;
        long position = s94Var.getPosition();
        int min = (int) Math.min(20000L, s94Var.getLength() - position);
        km8 km8Var = (km8) this.c;
        km8Var.J(min);
        s94Var.x(km8Var.a, 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (km8Var.a() >= 4) {
            if (yh4.a(km8Var.a, km8Var.b) != 442) {
                km8Var.N(1);
            } else {
                km8Var.N(4);
                long c = n99.c(km8Var);
                if (c != -9223372036854775807L) {
                    long b = ((lac) this.b).b(c);
                    if (b > j) {
                        if (j2 == -9223372036854775807L) {
                            return new al0(b, position, -1);
                        }
                        return new al0(-9223372036854775807L, position + i2, 0);
                    }
                    int i3 = ((b + 100000) > j ? 1 : ((b + 100000) == j ? 0 : -1));
                    int i4 = km8Var.b;
                    if (i3 > 0) {
                        return new al0(-9223372036854775807L, position + i4, 0);
                    }
                    i2 = i4;
                    j2 = b;
                }
                int i5 = km8Var.c;
                if (km8Var.a() < 10) {
                    km8Var.M(i5);
                } else {
                    km8Var.N(9);
                    int z = km8Var.z() & 7;
                    if (km8Var.a() < z) {
                        km8Var.M(i5);
                    } else {
                        km8Var.N(z);
                        if (km8Var.a() < 4) {
                            km8Var.M(i5);
                        } else {
                            if (yh4.a(km8Var.a, km8Var.b) == 443) {
                                km8Var.N(4);
                                int G = km8Var.G();
                                if (km8Var.a() < G) {
                                    km8Var.M(i5);
                                } else {
                                    km8Var.N(G);
                                }
                            }
                            while (true) {
                                if (km8Var.a() < 4 || (a = yh4.a(km8Var.a, km8Var.b)) == 442 || a == 441 || (a >>> 8) != 1) {
                                    break;
                                }
                                km8Var.N(4);
                                if (km8Var.a() < 2) {
                                    km8Var.M(i5);
                                    break;
                                }
                                km8Var.M(Math.min(km8Var.c, km8Var.b + km8Var.G()));
                            }
                        }
                    }
                }
                i = km8Var.b;
            }
        }
        if (j2 != -9223372036854775807L) {
            return new al0(j2, position + i, -2);
        }
        return al0.d;
    }

    @Override // defpackage.l6b
    public m6b apply() {
        be6 be6Var = (be6) this.b;
        ud6 x = x();
        if (x != null) {
            be6Var.d(x, false);
        }
        return be6Var.f(this.c);
    }

    @Override // defpackage.l6b
    public boolean b(iu1 iu1Var) {
        qo8 qo8Var;
        ud6 x = x();
        xt4 xt4Var = null;
        if (x != null) {
            qo8Var = x.f;
        } else {
            qo8Var = null;
        }
        if (qo8Var != null && !qo8Var.c()) {
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            }
            zqa h = pae.h(f);
            try {
                return qo8Var.e(iu1Var);
            } catch (Throwable th) {
                try {
                    x.getClass();
                    throw th;
                } finally {
                    pae.n(f, h, xt4Var);
                }
            }
        }
        return true;
    }

    @Override // defpackage.qe8
    public List c(Integer num) {
        List c = ((qe8) this.b).c(null);
        eqa eqaVar = (eqa) this.c;
        int i = eqaVar.v;
        if (i < 0) {
            return c;
        }
        return sl1.n0(xxe.p(eqaVar, num, i, Integer.valueOf(eqaVar.G(i, eqaVar.b))), c);
    }

    @Override // defpackage.l6b
    public void cancel() {
        qo8 qo8Var;
        switch (this.a) {
            case 1:
                ud6 x = x();
                if (x != null) {
                    qo8Var = x.f;
                } else {
                    qo8Var = null;
                }
                if (qo8Var != null) {
                    be6.b((be6) this.b, this.c);
                    return;
                }
                return;
            default:
                if (!((z30) this.c).compareAndSet(1, 1)) {
                    ((se0) this.b).invoke();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.pxa
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        pxa[] pxaVarArr = (pxa[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            pxa pxaVar = pxaVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = pxaVar.d(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((j55) this.c).d(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override // defpackage.qe8
    public boolean e() {
        return ((qe8) this.b).e();
    }

    @Override // defpackage.bl0
    public void f() {
        km8 km8Var = (km8) this.c;
        byte[] bArr = a2d.b;
        km8Var.getClass();
        km8Var.K(bArr, bArr.length);
    }

    @Override // defpackage.l29
    public long g(uy5 uy5Var, long j, tc6 tc6Var, long j2) {
        int i;
        int a;
        uy5Var.getClass();
        tc6Var.getClass();
        uy5 b = pc2.b(0L, j2);
        int i2 = b.b;
        int i3 = b.d;
        int i4 = b.a;
        int i5 = b.c;
        int min = Math.min(Math.abs(uy5Var.e()), Math.abs(uy5Var.b())) / 10;
        int i6 = uy5Var.a - min;
        int i7 = uy5Var.b - min;
        int i8 = uy5Var.c + min;
        int i9 = uy5Var.d + min;
        uy5 uy5Var2 = new uy5(i6, i7, i8, i9);
        n29 n29Var = (n29) this.b;
        n29 n29Var2 = n29.b;
        n29 n29Var3 = n29.a;
        if (n29Var != n29Var3 && n29Var != n29Var2) {
            i = ((int) (uy5Var2.a() >> 32)) - ((int) (b.a() >> 32));
        } else if ((n29Var == n29Var3 && tc6Var == tc6.a) || (n29Var == n29Var2 && tc6Var == tc6.b)) {
            i = i6 - i5;
        } else {
            i = i8 - i4;
        }
        if (n29Var != n29Var3 && n29Var != n29Var2) {
            if (n29Var == n29.c) {
                a = i7 - i3;
            } else {
                a = i9 - i2;
            }
        } else {
            a = ((int) (uy5Var2.a() & 4294967295L)) - ((int) (b.a() & 4294967295L));
        }
        int i10 = i4 + i;
        int i11 = i2 + a;
        int i12 = i5 + i;
        int i13 = i3 + a;
        uy5 b2 = pc2.b(0L, j);
        long j3 = (i10 << 32) | (i11 & 4294967295L);
        int i14 = (int) (j3 >> 32);
        int i15 = (int) (j3 & 4294967295L);
        int i16 = b2.c;
        if (i12 > i16) {
            i14 += i16 - i12;
        }
        int i17 = b2.d;
        if (i13 > i17) {
            i15 += i17 - i13;
        }
        int i18 = b2.a;
        if (i14 < i18) {
            i14 += i18 - i14;
        }
        int i19 = b2.b;
        if (i15 < i19) {
            i15 += i19 - i15;
        }
        uy5 b3 = pc2.b((i15 & 4294967295L) | (i14 << 32), ((i12 - i10) << 32) | ((i13 - i11) & 4294967295L));
        ((xt4) this.c).invoke(new py5(py5.c(uy5Var.a(), b3.d())));
        return b3.d();
    }

    @Override // defpackage.k99
    public Object get() {
        switch (this.a) {
            case 18:
                tw8 tw8Var = new tw8(7);
                jf8 jf8Var = new jf8(7);
                l0a l0aVar = (l0a) ((k99) this.b).get();
                return new hw9(tw8Var, jf8Var, kc0.f, l0aVar, (k99) this.c);
            default:
                return new eba((t9c) ((j99) this.b).get(), (r2d) ((j99) this.c).get());
        }
    }

    public void h(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(nk2.v(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    @Override // defpackage.l6b
    public boolean i() {
        qo8 qo8Var;
        ud6 x = x();
        if (x != null && (qo8Var = x.f) != null) {
            return qo8Var.c();
        }
        return true;
    }

    public void j(char c) {
        StringBuilder sb = (StringBuilder) this.c;
        if (sb != null) {
            sb.append(c);
        } else if (((String) this.b) != null) {
            u();
            StringBuilder sb2 = (StringBuilder) this.c;
            sb2.getClass();
            sb2.append(c);
        } else {
            this.b = String.valueOf(c);
        }
    }

    public void k(String str) {
        StringBuilder sb = (StringBuilder) this.c;
        if (sb != null) {
            sb.append(str);
        } else if (((String) this.b) != null) {
            u();
            StringBuilder sb2 = (StringBuilder) this.c;
            sb2.getClass();
            sb2.append(str);
        } else {
            this.b = str;
        }
    }

    public Object l() {
        rz rzVar = (rz) ((rwa) this.c).k();
        if (!rzVar.isEmpty()) {
            return rzVar.b(0);
        }
        return ((vt4) this.b).invoke();
    }

    @Override // defpackage.nw6
    public void m(String str) {
        pw6 pw6Var = (pw6) ((mu9) this.b).a;
        str.getClass();
        Method method = (Method) this.c;
        if (method == null) {
            pw6Var.g(str);
            return;
        }
        try {
            method.invoke(null, "Ktor Client", str);
        } catch (Throwable unused) {
            pw6Var.g(str);
        }
    }

    public Object n(String str, List list) {
        switch (this.a) {
            case 0:
                return ((s26) this.b).n("execute", list);
            default:
                try {
                    Scriptable scriptable = (ScriptableObject) this.c;
                    Object obj = scriptable.get(str, scriptable);
                    obj.getClass();
                    ScriptableObject scriptableObject = (ScriptableObject) this.c;
                    Object call = ((Function) obj).call((Context) this.b, scriptableObject, scriptableObject, list.toArray(new Object[0]));
                    if (call instanceof Undefined) {
                        return null;
                    }
                    return call;
                } catch (Exception e) {
                    String s = pye.s(e);
                    if (jy.a()) {
                        kw6 kw6Var = kw6.b;
                        iea ieaVar = iea.e;
                        if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                            kw6Var.a(ieaVar, "Log", s, null);
                        }
                    }
                    throw e;
                }
        }
    }

    public void o() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public void p() {
        switch (this.a) {
            case 0:
                ((k71) this.c).invoke();
                ((s26) this.b).p();
                return;
            default:
                ((Context) this.b).close();
                return;
        }
    }

    public Bundle q(String str) {
        Bundle bundle;
        sy9 sy9Var = (sy9) this.b;
        if (sy9Var.g) {
            Bundle bundle2 = sy9Var.f;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = cwe.j(str, bundle2);
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                sy9Var.f = null;
            }
            return bundle;
        }
        vs.k("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public boolean r(hmd hmdVar) {
        boolean containsKey;
        synchronized (this.c) {
            containsKey = ((r18) this.b).a.containsKey(hmdVar);
        }
        return containsKey;
    }

    public void s(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public Object t(String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                return ((s26) this.b).t(str);
            default:
                str.getClass();
                try {
                    return ((Context) this.b).evaluateString((ScriptableObject) this.c, str, "Javascript", 1, null);
                } catch (Exception e) {
                    String s = pye.s(e);
                    if (jy.a()) {
                        kw6 kw6Var = kw6.b;
                        iea ieaVar = iea.e;
                        if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                            kw6Var.a(ieaVar, "Log", s, null);
                        }
                    }
                    return null;
                }
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FileWriter fileWriter;
        Void r9 = (Void) obj;
        tc0 tc0Var = (tc0) this.c;
        JSONObject jSONObject = (JSONObject) ((wa2) ((ij1) this.b).d).a.submit(new k92(this, 2)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            zda C = ((l97) tc0Var.c).C(jSONObject);
            mce mceVar = (mce) tc0Var.e;
            long j = C.c;
            mceVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    jSONObject.put("expires_at", j);
                    try {
                        fileWriter = new FileWriter((File) mceVar.a);
                    } catch (Exception e) {
                        e = e;
                        fileWriter = null;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        fca.f(fileWriter, "Failed to close settings writer.");
                        tc0.d(jSONObject, "Loaded settings: ");
                        String str = ((gea) tc0Var.b).f;
                        SharedPreferences.Editor edit = ((android.content.Context) tc0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str);
                        edit.apply();
                        ((AtomicReference) tc0Var.h).set(C);
                        ((TaskCompletionSource) ((AtomicReference) tc0Var.i).get()).trySetResult(C);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fca.f(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e3) {
                    e = e3;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    fca.f(fileWriter, "Failed to close settings writer.");
                    tc0.d(jSONObject, "Loaded settings: ");
                    String str2 = ((gea) tc0Var.b).f;
                    SharedPreferences.Editor edit2 = ((android.content.Context) tc0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit2.putString("existing_instance_identifier", str2);
                    edit2.apply();
                    ((AtomicReference) tc0Var.h).set(C);
                    ((TaskCompletionSource) ((AtomicReference) tc0Var.i).get()).trySetResult(C);
                    return Tasks.forResult(null);
                }
                fca.f(fileWriter, "Failed to close settings writer.");
                tc0.d(jSONObject, "Loaded settings: ");
                String str22 = ((gea) tc0Var.b).f;
                SharedPreferences.Editor edit22 = ((android.content.Context) tc0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                edit22.putString("existing_instance_identifier", str22);
                edit22.apply();
                ((AtomicReference) tc0Var.h).set(C);
                ((TaskCompletionSource) ((AtomicReference) tc0Var.i).get()).trySetResult(C);
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                fca.f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 28:
                StringBuilder sb2 = (StringBuilder) this.c;
                if (sb2 != null) {
                    return sb2.toString();
                }
                String str = (String) this.b;
                if (str == null) {
                    return "";
                }
                return str;
            default:
                return super.toString();
        }
    }

    public void u() {
        StringBuilder b = d4b.b();
        this.c = b;
        b.getClass();
        b.append((String) this.b);
        this.b = null;
    }

    public void v() {
        xt4 xt4Var;
        hm8 hm8Var = (hm8) this.c;
        zqa f = pae.f();
        if (f != null) {
            xt4Var = f.e();
        } else {
            xt4Var = null;
        }
        zqa h = pae.h(f);
        try {
            d4c d4cVar = (d4c) hm8Var.getValue();
            if (d4cVar != null) {
                hvc hvcVar = (hvc) this.b;
                ora oraVar = (ora) hvcVar.b;
                ora oraVar2 = (ora) hvcVar.c;
                oraVar2.clear();
                while (oraVar2.size() + oraVar.size() > 99) {
                    if (!oraVar.isEmpty()) {
                        oraVar.remove(0);
                    } else {
                        p1a.l("List is empty.");
                        return;
                    }
                }
                oraVar.add(d4cVar);
            }
            hm8Var.setValue(null);
        } finally {
            pae.n(f, h, xt4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory w(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s26.w(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public ud6 x() {
        be6 be6Var = (be6) this.b;
        od6 od6Var = (od6) be6Var.F.g(this.c);
        if (od6Var != null) {
            return (ud6) be6Var.f.g(od6Var);
        }
        return null;
    }

    public ry9 y(String str) {
        ry9 ry9Var;
        sy9 sy9Var = (sy9) this.b;
        synchronized (sy9Var.c) {
            Iterator it = sy9Var.d.entrySet().iterator();
            do {
                ry9Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                ry9 ry9Var2 = (ry9) entry.getValue();
                if (c16.i((String) entry.getKey(), str)) {
                    ry9Var = ry9Var2;
                    continue;
                }
            } while (ry9Var == null);
        }
        return ry9Var;
    }

    public String z(String str) {
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", (String) this.c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public /* synthetic */ s26(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ s26(Object obj) {
        this.a = 7;
        this.c = obj;
        this.b = new ArrayList();
    }

    public s26(vt4 vt4Var) {
        this.a = 23;
        this.b = vt4Var;
        this.c = new rwa(new mia(17));
    }

    public s26(sy9 sy9Var) {
        this.a = 19;
        this.b = sy9Var;
    }

    public s26(pxa[] pxaVarArr) {
        this.a = 5;
        this.b = pxaVarArr;
        this.c = new j55(29);
    }

    public s26(se0 se0Var) {
        this.a = 9;
        this.b = se0Var;
        this.c = new AtomicInteger(0);
    }

    public s26(ExecutorService executorService) {
        this.a = 16;
        this.c = new jla(0);
        this.b = executorService;
    }

    public /* synthetic */ s26(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public s26(Class cls, mu9 mu9Var) {
        Method method;
        this.a = 3;
        this.b = mu9Var;
        try {
            method = cls.getDeclaredMethod("i", String.class, String.class);
        } catch (Throwable unused) {
            method = null;
        }
        this.c = method;
    }

    public s26(lac lacVar) {
        this.a = 15;
        this.b = lacVar;
        this.c = new km8();
    }

    public s26(r18 r18Var) {
        this.a = 26;
        this.b = r18Var;
        this.c = new Object();
    }

    public s26(android.content.Context context, int i) {
        this.a = i;
        switch (i) {
            case 25:
                am8.s(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
            default:
                this.c = null;
                this.b = context;
                return;
        }
    }

    public s26(tc0 tc0Var, ij1 ij1Var) {
        this.a = 21;
        this.c = tc0Var;
        this.b = ij1Var;
    }
}
