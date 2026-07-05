package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uuc  reason: default package */
/* loaded from: classes.dex */
public final class uuc {
    public int a;
    public final avc b;
    public byte[] c;
    public int d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public byte[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, avc] */
    public uuc() {
        ?? obj = new Object();
        obj.a = (byte) 0;
        obj.b = "";
        obj.c = "";
        obj.d = "";
        obj.e = "";
        obj.f = "";
        obj.g = "";
        obj.h = "";
        obj.i = "";
        this.b = obj;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new byte[0];
    }

    public final ArrayList a() {
        Comparable comparable;
        int i;
        String str;
        byte[] bArr;
        int i2;
        int i3;
        Integer valueOf = Integer.valueOf(this.a);
        ArrayList arrayList = this.e;
        Integer valueOf2 = Integer.valueOf(arrayList.size());
        ArrayList arrayList2 = this.f;
        Iterator it = tl1.B(valueOf, valueOf2, Integer.valueOf(arrayList2.size())).iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(i);
        for (int i4 = 0; i4 < i; i4++) {
            byte[] bArr2 = (byte[]) sl1.f0(i4, arrayList);
            if (bArr2 != null) {
                str = fd1.c.a(bArr2);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            v56 v56Var = fd1.c;
            Integer num2 = (Integer) sl1.f0(i4, arrayList2);
            if (num2 != null) {
                int intValue = num2.intValue();
                Integer num3 = (Integer) sl1.f0(i4 + 1, arrayList2);
                if (num3 != null) {
                    i3 = num3.intValue();
                } else {
                    i3 = this.d;
                    int length = this.h.length;
                    if (i3 > length) {
                        i3 = length;
                    }
                }
                if (intValue < i3 && intValue >= 0) {
                    byte[] bArr3 = this.h;
                    if (intValue <= bArr3.length) {
                        int length2 = bArr3.length;
                        if (i3 > length2) {
                            i3 = length2;
                        }
                        bArr = b00.d0(bArr3, intValue, i3);
                    }
                }
                bArr = new byte[0];
            } else {
                bArr = new byte[0];
            }
            String replace = v56Var.a(bArr).replace((char) 8233, '\n');
            replace.getClass();
            Integer num4 = (Integer) sl1.f0(i4, arrayList2);
            if (num4 != null) {
                i2 = num4.intValue();
            } else {
                i2 = 0;
            }
            arrayList3.add(new vuc(str, replace, i2));
        }
        return arrayList3;
    }
}
