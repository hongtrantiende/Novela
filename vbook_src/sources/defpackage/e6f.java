package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e6f  reason: default package */
/* loaded from: classes.dex */
public final class e6f extends f5f {
    public long d;
    public long e;

    public static boolean B0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public static boolean C0(e1e e1eVar, int i) {
        if (i < ((o1e) e1eVar).c * 64) {
            if (((1 << (i % 64)) & ((Long) ((o1e) e1eVar).get(i / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList D0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static m0e I0(m0e m0eVar, byte[] bArr) {
        h0e a = h0e.a();
        if (a != null) {
            m0eVar.getClass();
            m0eVar.f(bArr, bArr.length, a);
            return m0eVar;
        }
        m0eVar.getClass();
        int length = bArr.length;
        int i = kzd.a;
        m0eVar.f(bArr, length, h0e.b);
        return m0eVar;
    }

    public static int J0(String str, jte jteVar) {
        for (int i = 0; i < ((nte) jteVar.b).a2(); i++) {
            if (str.equals(((nte) jteVar.b).b2(i).v())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] K0(f1e f1eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = f1eVar.iterator();
        while (it.hasNext()) {
            tse tseVar = (tse) it.next();
            if (tseVar != null) {
                Bundle bundle = new Bundle();
                for (tse tseVar2 : tseVar.D()) {
                    if (tseVar2.v()) {
                        bundle.putString(tseVar2.u(), tseVar2.w());
                    } else if (tseVar2.x()) {
                        bundle.putLong(tseVar2.u(), tseVar2.y());
                    } else if (tseVar2.B()) {
                        bundle.putDouble(tseVar2.u(), tseVar2.C());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(L0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(L0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(L0((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap L0(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = L0(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = L0(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = L0(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6f.L0(android.os.Bundle, boolean):java.util.HashMap");
    }

    public static ibe b0(hxd hxdVar) {
        String str;
        Object obj;
        Bundle c0 = c0(hxdVar.c, true);
        if (c0.containsKey("_o") && (obj = c0.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String r = bce.r(hxdVar.a, ctd.d, ctd.i);
        if (r == null) {
            r = hxdVar.a;
        }
        return new ibe(r, new dbe(c0), str2, hxdVar.b, 0L);
    }

    public static Bundle c0(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(c0((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public static final void f0(gse gseVar, String str, Long l) {
        List g = gseVar.g();
        int i = 0;
        while (true) {
            if (i < g.size()) {
                if (str.equals(((tse) g.get(i)).u())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        qse F = tse.F();
        F.g(str);
        F.i(l.longValue());
        if (i >= 0) {
            gseVar.b();
            ((jse) gseVar.b).K(i, (tse) F.d());
            return;
        }
        gseVar.k(F);
    }

    public static final Bundle g0(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tse tseVar = (tse) it.next();
            String u = tseVar.u();
            if (tseVar.B()) {
                bundle.putDouble(u, tseVar.C());
            } else if (tseVar.z()) {
                bundle.putFloat(u, tseVar.A());
            } else if (tseVar.v()) {
                bundle.putString(u, tseVar.w());
            } else if (tseVar.x()) {
                bundle.putLong(u, tseVar.y());
            }
        }
        return bundle;
    }

    public static final tse h0(String str, jse jseVar) {
        for (tse tseVar : jseVar.v()) {
            if (tseVar.u().equals(str)) {
                return tseVar;
            }
        }
        return null;
    }

    public static final String i0(Map map, String str) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    if (entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                        return (String) ((List) entry.getValue()).get(0);
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final Serializable j0(String str, jse jseVar) {
        tse h0 = h0(str, jseVar);
        if (h0 == null) {
            return null;
        }
        return p0(h0);
    }

    public static final void m0(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void n0(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (!hashSet.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static final String o0(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable p0(tse tseVar) {
        if (tseVar.v()) {
            return tseVar.w();
        }
        if (tseVar.x()) {
            return Long.valueOf(tseVar.y());
        }
        if (tseVar.B()) {
            return Double.valueOf(tseVar.C());
        }
        if (tseVar.E() > 0) {
            return K0(tseVar.D());
        }
        return null;
    }

    public static final void q0(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                n0(builder, str3, string, hashSet);
            }
        }
    }

    public static final void r0(StringBuilder sb, String str, aue aueVar) {
        Integer num;
        Integer num2;
        Long l;
        if (aueVar == null) {
            return;
        }
        m0(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (aueVar.w() != 0) {
            m0(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l2 : aueVar.v()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i = i2;
            }
            sb.append('\n');
        }
        if (aueVar.u() != 0) {
            m0(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l3 : aueVar.t()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (aueVar.y() != 0) {
            m0(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (dse dseVar : aueVar.x()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                if (dseVar.t()) {
                    num2 = Integer.valueOf(dseVar.u());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (dseVar.v()) {
                    l = Long.valueOf(dseVar.w());
                } else {
                    l = null;
                }
                sb.append(l);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (aueVar.A() != 0) {
            m0(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (fue fueVar : aueVar.z()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                if (fueVar.t()) {
                    num = Integer.valueOf(fueVar.u());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                int i9 = 0;
                for (Long l4 : fueVar.v()) {
                    long longValue = l4.longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m0(3, sb);
        sb.append("}\n");
    }

    public static final void s0(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m0(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void t0(StringBuilder sb, int i, String str, yle yleVar) {
        String str2;
        if (yleVar == null) {
            return;
        }
        m0(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (yleVar.t()) {
            int D = yleVar.D();
            if (D != 1) {
                if (D != 2) {
                    if (D != 3) {
                        if (D != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            s0(sb, i, "comparison_type", str2);
        }
        if (yleVar.u()) {
            s0(sb, i, "match_as_float", Boolean.valueOf(yleVar.v()));
        }
        if (yleVar.w()) {
            s0(sb, i, "comparison_value", yleVar.x());
        }
        if (yleVar.y()) {
            s0(sb, i, "min_comparison_value", yleVar.z());
        }
        if (yleVar.A()) {
            s0(sb, i, "max_comparison_value", yleVar.B());
        }
        m0(i, sb);
        sb.append("}\n");
    }

    public final Parcelable A0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (vw9 unused) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.f.e("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public final List E0(e1e e1eVar, List list) {
        int i;
        lte lteVar = (lte) this.a;
        ArrayList arrayList = new ArrayList(e1eVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.E.f(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    ppe ppeVar2 = lteVar.f;
                    lte.m(ppeVar2);
                    ppeVar2.E.g(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean F0(long j, long j2) {
        if (j != 0 && j2 > 0) {
            ((lte) this.a).G.getClass();
            if (Math.abs(System.currentTimeMillis() - j) <= j2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final long G0(byte[] bArr) {
        am8.s(bArr);
        lte lteVar = (lte) this.a;
        l6f l6fVar = lteVar.E;
        lte.k(l6fVar);
        l6fVar.W();
        MessageDigest q0 = l6f.q0();
        if (q0 == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.e("Failed to get MD5");
            return 0L;
        }
        return l6f.r0(q0.digest(bArr));
    }

    public final byte[] H0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.f.f(e, "Failed to gzip content");
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(java.util.Map r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.a
            lte r0 = (defpackage.lte) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L50
            java.lang.String r3 = "Date"
            java.lang.String r10 = i0(r10, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L50
            r3 = 0
            if (r1 < r2) goto L35
            j$.time.format.DateTimeFormatter r1 = j$.time.format.DateTimeFormatter.RFC_1123_DATE_TIME     // Catch: j$.time.format.DateTimeParseException -> L29
            j$.time.ZonedDateTime r1 = j$.time.ZonedDateTime.parse(r10, r1)     // Catch: j$.time.format.DateTimeParseException -> L29
            j$.time.Instant r1 = r1.toInstant()     // Catch: j$.time.format.DateTimeParseException -> L29
            long r1 = r1.toEpochMilli()     // Catch: j$.time.format.DateTimeParseException -> L29
            goto L36
        L29:
            ppe r1 = r0.f
            defpackage.lte.m(r1)
            s56 r1 = r1.E
            java.lang.String r2 = "Unable to parse header time, time"
            r1.f(r10, r2)
        L35:
            r1 = r3
        L36:
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L50
            kh5 r10 = r0.G
            r10.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            r9.W()
            long r7 = r9.e
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r10 != 0) goto L50
            r9.d = r5
            r9.e = r1
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6f.d0(java.util.Map):void");
    }

    public final long e0(long j) {
        W();
        long j2 = this.e;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.d) + j;
    }

    public final void k0(StringBuilder sb, int i, f1e f1eVar) {
        String str;
        String str2;
        Long l;
        if (f1eVar != null) {
            int i2 = i + 1;
            Iterator it = f1eVar.iterator();
            while (it.hasNext()) {
                tse tseVar = (tse) it.next();
                if (tseVar != null) {
                    m0(i2, sb);
                    sb.append("param {\n");
                    Double d = null;
                    if (tseVar.t()) {
                        str = ((lte) this.a).F.b(tseVar.u());
                    } else {
                        str = null;
                    }
                    s0(sb, i2, "name", str);
                    if (tseVar.v()) {
                        str2 = tseVar.w();
                    } else {
                        str2 = null;
                    }
                    s0(sb, i2, "string_value", str2);
                    if (tseVar.x()) {
                        l = Long.valueOf(tseVar.y());
                    } else {
                        l = null;
                    }
                    s0(sb, i2, "int_value", l);
                    if (tseVar.B()) {
                        d = Double.valueOf(tseVar.C());
                    }
                    s0(sb, i2, "double_value", d);
                    if (tseVar.E() > 0) {
                        k0(sb, i2, tseVar.D());
                    }
                    m0(i2, sb);
                    sb.append("}\n");
                }
            }
        }
    }

    public final void l0(StringBuilder sb, int i, ple pleVar) {
        String str;
        if (pleVar == null) {
            return;
        }
        m0(i, sb);
        sb.append("filter {\n");
        if (pleVar.x()) {
            s0(sb, i, "complement", Boolean.valueOf(pleVar.y()));
        }
        if (pleVar.z()) {
            s0(sb, i, "param_name", ((lte) this.a).F.b(pleVar.A()));
        }
        if (pleVar.t()) {
            int i2 = i + 1;
            jme u = pleVar.u();
            if (u != null) {
                m0(i2, sb);
                sb.append("string_filter {\n");
                if (u.t()) {
                    switch (u.B()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    s0(sb, i2, "match_type", str);
                }
                if (u.u()) {
                    s0(sb, i2, "expression", u.v());
                }
                if (u.w()) {
                    s0(sb, i2, "case_sensitive", Boolean.valueOf(u.x()));
                }
                if (u.z() > 0) {
                    m0(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : u.y()) {
                        m0(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m0(i2, sb);
                sb.append("}\n");
            }
        }
        if (pleVar.v()) {
            t0(sb, i + 1, "number_filter", pleVar.w());
        }
        m0(i, sb);
        sb.append("}\n");
    }

    public final void u0(tue tueVar, Object obj) {
        am8.s(obj);
        tueVar.b();
        ((wue) tueVar.b).I();
        tueVar.b();
        ((wue) tueVar.b).K();
        tueVar.b();
        ((wue) tueVar.b).M();
        if (obj instanceof String) {
            tueVar.b();
            ((wue) tueVar.b).H((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            tueVar.b();
            ((wue) tueVar.b).J(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            tueVar.b();
            ((wue) tueVar.b).L(doubleValue);
        } else {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.f.f(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void v0(qse qseVar, Object obj) {
        Bundle[] bundleArr;
        qseVar.b();
        ((tse) qseVar.b).I();
        qseVar.b();
        ((tse) qseVar.b).K();
        qseVar.b();
        ((tse) qseVar.b).M();
        qseVar.b();
        ((tse) qseVar.b).P();
        if (obj instanceof String) {
            qseVar.h((String) obj);
        } else if (obj instanceof Long) {
            qseVar.i(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            qseVar.b();
            ((tse) qseVar.b).L(doubleValue);
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    qse F = tse.F();
                    for (String str : bundle.keySet()) {
                        qse F2 = tse.F();
                        F2.g(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            F2.i(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            F2.h((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            F2.b();
                            ((tse) F2.b).L(doubleValue2);
                        }
                        F.b();
                        ((tse) F.b).N((tse) F2.d());
                    }
                    if (((tse) F.b).E() > 0) {
                        arrayList.add((tse) F.d());
                    }
                }
            }
            qseVar.b();
            ((tse) qseVar.b).O(arrayList);
        } else {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.f.f(obj, "Ignoring invalid (type) event param value");
        }
    }

    public final p4f w0(String str, jte jteVar, gse gseVar, String str2) {
        int indexOf;
        q5e.a();
        lte lteVar = (lte) this.a;
        t7e t7eVar = lteVar.d;
        if (t7eVar.i0(str, yme.O0)) {
            lteVar.G.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            HashSet hashSet = new HashSet(Arrays.asList(t7eVar.e0(str, yme.t0).split(",")));
            a6f a6fVar = this.b;
            k5f k5fVar = a6fVar.F;
            lse lseVar = a6fVar.a;
            lse lseVar2 = k5fVar.b.a;
            a6f.U(lseVar2);
            String k0 = lseVar2.k0(str);
            Uri.Builder builder = new Uri.Builder();
            t7e t7eVar2 = ((lte) k5fVar.a).d;
            builder.scheme(t7eVar2.e0(str, yme.m0));
            if (!TextUtils.isEmpty(k0)) {
                String e0 = t7eVar2.e0(str, yme.n0);
                StringBuilder sb = new StringBuilder(String.valueOf(k0).length() + 1 + String.valueOf(e0).length());
                sb.append(k0);
                sb.append(".");
                sb.append(e0);
                builder.authority(sb.toString());
            } else {
                builder.authority(t7eVar2.e0(str, yme.n0));
            }
            builder.path(t7eVar2.e0(str, yme.o0));
            n0(builder, "gmp_app_id", ((nte) jteVar.b).I(), hashSet);
            t7eVar.d0();
            n0(builder, "gmp_version", String.valueOf(161000L), hashSet);
            String C = ((nte) jteVar.b).C();
            wme wmeVar = yme.R0;
            if (t7eVar.i0(str, wmeVar)) {
                a6f.U(lseVar);
                if (lseVar.r0(str)) {
                    C = "";
                }
            }
            n0(builder, "app_instance_id", C, hashSet);
            n0(builder, "rdid", ((nte) jteVar.b).z(), hashSet);
            n0(builder, "bundle_id", jteVar.n(), hashSet);
            String m = gseVar.m();
            String r = bce.r(m, ctd.i, ctd.d);
            if (true != TextUtils.isEmpty(r)) {
                m = r;
            }
            n0(builder, "app_event_name", m, hashSet);
            n0(builder, "app_version", String.valueOf(((nte) jteVar.b).O()), hashSet);
            String n2 = ((nte) jteVar.b).n2();
            if (t7eVar.i0(str, wmeVar)) {
                a6f.U(lseVar);
                if (lseVar.q0(str) && !TextUtils.isEmpty(n2) && (indexOf = n2.indexOf(".")) != -1) {
                    n2 = n2.substring(0, indexOf);
                }
            }
            n0(builder, "os_version", n2, hashSet);
            n0(builder, "timestamp", String.valueOf(gseVar.o()), hashSet);
            String str3 = "1";
            if (((nte) jteVar.b).B()) {
                n0(builder, "lat", "1", hashSet);
            }
            n0(builder, "privacy_sandbox_version", String.valueOf(((nte) jteVar.b).K0()), hashSet);
            n0(builder, "trigger_uri_source", "1", hashSet);
            n0(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), hashSet);
            n0(builder, "request_uuid", str2, hashSet);
            List<tse> g = gseVar.g();
            Bundle bundle = new Bundle();
            for (tse tseVar : g) {
                String u = tseVar.u();
                if (tseVar.B()) {
                    bundle.putString(u, String.valueOf(tseVar.C()));
                } else if (tseVar.z()) {
                    bundle.putString(u, String.valueOf(tseVar.A()));
                } else if (tseVar.v()) {
                    bundle.putString(u, tseVar.w());
                } else if (tseVar.x()) {
                    bundle.putString(u, String.valueOf(tseVar.y()));
                }
            }
            q0(builder, t7eVar.e0(str, yme.s0).split("\\|"), bundle, hashSet);
            List<wue> unmodifiableList = Collections.unmodifiableList(((nte) jteVar.b).Z1());
            Bundle bundle2 = new Bundle();
            for (wue wueVar : unmodifiableList) {
                String v = wueVar.v();
                if (wueVar.C()) {
                    bundle2.putString(v, String.valueOf(wueVar.D()));
                } else if (wueVar.A()) {
                    bundle2.putString(v, String.valueOf(wueVar.B()));
                } else if (wueVar.w()) {
                    bundle2.putString(v, wueVar.x());
                } else if (wueVar.y()) {
                    bundle2.putString(v, String.valueOf(wueVar.z()));
                }
            }
            q0(builder, t7eVar.e0(str, yme.r0).split("\\|"), bundle2, hashSet);
            if (true != ((nte) jteVar.b).H0()) {
                str3 = "0";
            }
            n0(builder, "dma", str3, hashSet);
            if (!((nte) jteVar.b).J0().isEmpty()) {
                n0(builder, "dma_cps", ((nte) jteVar.b).J0(), hashSet);
            }
            if (((nte) jteVar.b).P0()) {
                iqe Q0 = ((nte) jteVar.b).Q0();
                if (!Q0.H().isEmpty()) {
                    n0(builder, "dl_gclid", Q0.H(), hashSet);
                }
                if (!Q0.J().isEmpty()) {
                    n0(builder, "dl_gbraid", Q0.J(), hashSet);
                }
                if (!Q0.L().isEmpty()) {
                    n0(builder, "dl_gs", Q0.L(), hashSet);
                }
                if (Q0.N() > 0) {
                    n0(builder, "dl_ss_ts", String.valueOf(Q0.N()), hashSet);
                }
                if (!Q0.P().isEmpty()) {
                    n0(builder, "mr_gclid", Q0.P(), hashSet);
                }
                if (!Q0.R().isEmpty()) {
                    n0(builder, "mr_gbraid", Q0.R(), hashSet);
                }
                if (!Q0.T().isEmpty()) {
                    n0(builder, "mr_gs", Q0.T(), hashSet);
                }
                if (Q0.V() > 0) {
                    n0(builder, "mr_click_ts", String.valueOf(Q0.V()), hashSet);
                }
            }
            return new p4f(builder.build().toString(), currentTimeMillis, 1);
        }
        return null;
    }

    public final jse x0(wae waeVar) {
        gse J = jse.J();
        long j = waeVar.f;
        J.b();
        ((jse) J.b).R(j);
        long j2 = waeVar.e;
        J.b();
        ((jse) J.b).t(j2);
        dbe dbeVar = waeVar.g;
        Objects.requireNonNull(dbeVar);
        Bundle bundle = dbeVar.a;
        for (String str : bundle.keySet()) {
            qse F = tse.F();
            F.g(str);
            Object obj = bundle.get(str);
            am8.s(obj);
            v0(F, obj);
            J.k(F);
        }
        String str2 = waeVar.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            qse F2 = tse.F();
            F2.g("_o");
            F2.h(str2);
            J.j((tse) F2.d());
        }
        return (jse) J.d();
    }

    public final String y0(hte hteVar) {
        Long l;
        Long l2;
        Double d;
        String str;
        String str2;
        String str3;
        String str4;
        uqe M0;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (hteVar.y()) {
            s0(sb, 0, "upload_subdomain", hteVar.z());
        }
        if (hteVar.w()) {
            s0(sb, 0, "sgtm_join_id", hteVar.x());
        }
        for (nte nteVar : hteVar.t()) {
            if (nteVar != null) {
                m0(1, sb);
                sb.append("bundle {\n");
                if (nteVar.T()) {
                    s0(sb, 1, "protocol_version", Integer.valueOf(nteVar.T0()));
                }
                e6e e6eVar = (e6e) c6e.b.a.a;
                lte lteVar = (lte) this.a;
                t7e t7eVar = lteVar.d;
                yoe yoeVar = lteVar.F;
                if (t7eVar.i0(nteVar.t(), yme.M0) && nteVar.z0()) {
                    s0(sb, 1, "session_stitching_token", nteVar.A0());
                }
                s0(sb, 1, "platform", nteVar.m2());
                if (nteVar.v()) {
                    s0(sb, 1, "gmp_version", Long.valueOf(nteVar.w()));
                }
                if (nteVar.x()) {
                    s0(sb, 1, "uploading_gmp_version", Long.valueOf(nteVar.y()));
                }
                if (nteVar.v0()) {
                    s0(sb, 1, "dynamite_version", Long.valueOf(nteVar.w0()));
                }
                if (nteVar.P()) {
                    s0(sb, 1, "config_version", Long.valueOf(nteVar.Q()));
                }
                s0(sb, 1, "gmp_app_id", nteVar.I());
                s0(sb, 1, "app_id", nteVar.t());
                s0(sb, 1, "app_version", nteVar.u());
                if (nteVar.N()) {
                    s0(sb, 1, "app_version_major", Integer.valueOf(nteVar.O()));
                }
                s0(sb, 1, "firebase_instance_id", nteVar.M());
                if (nteVar.D()) {
                    s0(sb, 1, "dev_cert_hash", Long.valueOf(nteVar.E()));
                }
                s0(sb, 1, "app_store", nteVar.s2());
                if (nteVar.c2()) {
                    s0(sb, 1, "upload_timestamp_millis", Long.valueOf(nteVar.d2()));
                }
                if (nteVar.e2()) {
                    s0(sb, 1, "start_timestamp_millis", Long.valueOf(nteVar.f2()));
                }
                if (nteVar.g2()) {
                    s0(sb, 1, "end_timestamp_millis", Long.valueOf(nteVar.h2()));
                }
                if (nteVar.i2()) {
                    s0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(nteVar.j2()));
                }
                if (nteVar.k2()) {
                    s0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(nteVar.l2()));
                }
                s0(sb, 1, "app_instance_id", nteVar.C());
                s0(sb, 1, "resettable_device_id", nteVar.z());
                s0(sb, 1, "ds_id", nteVar.S());
                if (nteVar.A()) {
                    s0(sb, 1, "limited_ad_tracking", Boolean.valueOf(nteVar.B()));
                }
                s0(sb, 1, "os_version", nteVar.n2());
                s0(sb, 1, "device_model", nteVar.o2());
                s0(sb, 1, "user_default_language", nteVar.p2());
                if (nteVar.q2()) {
                    s0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(nteVar.r2()));
                }
                if (nteVar.F()) {
                    s0(sb, 1, "bundle_sequential_index", Integer.valueOf(nteVar.G()));
                }
                if (nteVar.N0()) {
                    s0(sb, 1, "delivery_index", Integer.valueOf(nteVar.O0()));
                }
                if (nteVar.J()) {
                    s0(sb, 1, "service_upload", Boolean.valueOf(nteVar.K()));
                }
                s0(sb, 1, "health_monitor", nteVar.H());
                if (nteVar.t0()) {
                    s0(sb, 1, "retry_counter", Integer.valueOf(nteVar.u0()));
                }
                if (nteVar.x0()) {
                    s0(sb, 1, "consent_signals", nteVar.y0());
                }
                if (nteVar.G0()) {
                    s0(sb, 1, "is_dma_region", Boolean.valueOf(nteVar.H0()));
                }
                if (nteVar.I0()) {
                    s0(sb, 1, "core_platform_services", nteVar.J0());
                }
                if (nteVar.E0()) {
                    s0(sb, 1, "consent_diagnostics", nteVar.F0());
                }
                if (nteVar.B0()) {
                    s0(sb, 1, "target_os_version", Long.valueOf(nteVar.C0()));
                }
                q5e.a();
                if (t7eVar.i0(nteVar.t(), yme.O0)) {
                    s0(sb, 1, "ad_services_version", Integer.valueOf(nteVar.K0()));
                    if (nteVar.L0() && (M0 = nteVar.M0()) != null) {
                        m0(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        s0(sb, 2, "eligible", Boolean.valueOf(M0.t()));
                        s0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(M0.u()));
                        s0(sb, 2, "pre_r", Boolean.valueOf(M0.v()));
                        s0(sb, 2, "r_extensions_too_old", Boolean.valueOf(M0.w()));
                        s0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(M0.x()));
                        s0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(M0.y()));
                        s0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(M0.z()));
                        m0(2, sb);
                        sb.append("}\n");
                    }
                }
                if (nteVar.P0()) {
                    iqe Q0 = nteVar.Q0();
                    m0(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (Q0.G()) {
                        s0(sb, 2, "deep_link_gclid", Q0.H());
                    }
                    if (Q0.I()) {
                        s0(sb, 2, "deep_link_gbraid", Q0.J());
                    }
                    if (Q0.K()) {
                        s0(sb, 2, "deep_link_gad_source", Q0.L());
                    }
                    if (Q0.W()) {
                        s0(sb, 2, "deep_link_url", Q0.X());
                    }
                    if (Q0.M()) {
                        s0(sb, 2, "deep_link_session_millis", Long.valueOf(Q0.N()));
                    }
                    if (Q0.O()) {
                        s0(sb, 2, "market_referrer_gclid", Q0.P());
                    }
                    if (Q0.Q()) {
                        s0(sb, 2, "market_referrer_gbraid", Q0.R());
                    }
                    if (Q0.S()) {
                        s0(sb, 2, "market_referrer_gad_source", Q0.T());
                    }
                    if (Q0.U()) {
                        s0(sb, 2, "market_referrer_click_millis", Long.valueOf(Q0.V()));
                    }
                    m0(2, sb);
                    sb.append("}\n");
                }
                if (nteVar.U()) {
                    s0(sb, 1, "batching_timestamp_millis", Long.valueOf(nteVar.V()));
                }
                if (nteVar.R0()) {
                    rue S0 = nteVar.S0();
                    m0(2, sb);
                    sb.append("sgtm_diagnostics {\n");
                    int x = S0.x();
                    if (x != 1) {
                        if (x != 2) {
                            if (x != 3) {
                                if (x != 4) {
                                    str3 = "SDK_SERVICE_UPLOAD";
                                } else {
                                    str3 = "PACKAGE_SERVICE_UPLOAD";
                                }
                            } else {
                                str3 = "SDK_CLIENT_UPLOAD";
                            }
                        } else {
                            str3 = "GA_UPLOAD";
                        }
                    } else {
                        str3 = "UPLOAD_TYPE_UNKNOWN";
                    }
                    s0(sb, 2, "upload_type", str3);
                    s0(sb, 2, "client_upload_eligibility", eub.A(S0.t()));
                    int y = S0.y();
                    if (y != 1) {
                        if (y != 2) {
                            if (y != 3) {
                                if (y != 4) {
                                    if (y != 5) {
                                        str4 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                                    } else {
                                        str4 = "MISSING_SGTM_PROXY_INFO";
                                    }
                                } else {
                                    str4 = "MISSING_SGTM_SETTINGS";
                                }
                            } else {
                                str4 = "NOT_IN_ROLLOUT";
                            }
                        } else {
                            str4 = "SERVICE_UPLOAD_ELIGIBLE";
                        }
                    } else {
                        str4 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    }
                    s0(sb, 2, "service_upload_eligibility", str4);
                    m0(2, sb);
                    sb.append("}\n");
                }
                if (nteVar.W()) {
                    wre X = nteVar.X();
                    m0(2, sb);
                    sb.append("consent_info_extra {\n");
                    for (pre preVar : X.t()) {
                        m0(3, sb);
                        sb.append("limited_data_modes {\n");
                        int u = preVar.u();
                        if (u != 1) {
                            if (u != 2) {
                                if (u != 3) {
                                    if (u != 4) {
                                        str = "AD_PERSONALIZATION";
                                    } else {
                                        str = "AD_USER_DATA";
                                    }
                                } else {
                                    str = "ANALYTICS_STORAGE";
                                }
                            } else {
                                str = "AD_STORAGE";
                            }
                        } else {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        }
                        s0(sb, 3, "type", str);
                        int v = preVar.v();
                        if (v != 1) {
                            if (v != 2) {
                                str2 = "NO_DATA_MODE";
                            } else {
                                str2 = "LIMITED_MODE";
                            }
                        } else {
                            str2 = "NOT_LIMITED";
                        }
                        s0(sb, 3, "mode", str2);
                        m0(3, sb);
                        sb.append("}\n");
                    }
                    m0(2, sb);
                    sb.append("}\n");
                }
                f1e<wue> Z1 = nteVar.Z1();
                if (Z1 != null) {
                    for (wue wueVar : Z1) {
                        if (wueVar != null) {
                            m0(2, sb);
                            sb.append("user_property {\n");
                            if (wueVar.t()) {
                                l = Long.valueOf(wueVar.u());
                            } else {
                                l = null;
                            }
                            s0(sb, 2, "set_timestamp_millis", l);
                            s0(sb, 2, "name", yoeVar.c(wueVar.v()));
                            s0(sb, 2, "string_value", wueVar.x());
                            if (wueVar.y()) {
                                l2 = Long.valueOf(wueVar.z());
                            } else {
                                l2 = null;
                            }
                            s0(sb, 2, "int_value", l2);
                            if (wueVar.C()) {
                                d = Double.valueOf(wueVar.D());
                            } else {
                                d = null;
                            }
                            s0(sb, 2, "double_value", d);
                            m0(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                f1e<are> L = nteVar.L();
                if (L != null) {
                    for (are areVar : L) {
                        if (areVar != null) {
                            m0(2, sb);
                            sb.append("audience_membership {\n");
                            if (areVar.t()) {
                                s0(sb, 2, "audience_id", Integer.valueOf(areVar.u()));
                            }
                            if (areVar.y()) {
                                s0(sb, 2, "new_audience", Boolean.valueOf(areVar.z()));
                            }
                            r0(sb, "current_data", areVar.v());
                            if (areVar.w()) {
                                r0(sb, "previous_data", areVar.x());
                            }
                            m0(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                List<jse> T1 = nteVar.T1();
                if (T1 != null) {
                    for (jse jseVar : T1) {
                        if (jseVar != null) {
                            m0(2, sb);
                            sb.append("event {\n");
                            s0(sb, 2, "name", yoeVar.a(jseVar.y()));
                            if (jseVar.z()) {
                                s0(sb, 2, "timestamp_millis", Long.valueOf(jseVar.A()));
                            }
                            if (t7eVar.i0(null, yme.e1) && jseVar.F()) {
                                s0(sb, 2, "corrected_timestamp_millis", Long.valueOf(jseVar.G()));
                            }
                            if (jseVar.B()) {
                                s0(sb, 2, "previous_timestamp_millis", Long.valueOf(jseVar.C()));
                            }
                            if (jseVar.D()) {
                                s0(sb, 2, "count", Integer.valueOf(jseVar.E()));
                            }
                            if (jseVar.w() != 0) {
                                k0(sb, 2, (f1e) jseVar.v());
                            }
                            m0(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                m0(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public final String z0(cme cmeVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (cmeVar.t()) {
            s0(sb, 0, "filter_id", Integer.valueOf(cmeVar.u()));
        }
        s0(sb, 0, "property_name", ((lte) this.a).F.c(cmeVar.v()));
        String o0 = o0(cmeVar.x(), cmeVar.y(), cmeVar.A());
        if (!o0.isEmpty()) {
            s0(sb, 0, "filter_type", o0);
        }
        l0(sb, 1, cmeVar.w());
        sb.append("}\n");
        return sb.toString();
    }

    @Override // defpackage.f5f
    public final void a0() {
    }
}
