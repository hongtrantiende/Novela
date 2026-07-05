package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o45  reason: default package */
/* loaded from: classes3.dex */
public final class o45 extends c3e {
    @Override // defpackage.c3e
    public final void M(String str) {
        str.getClass();
        List list = lg5.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (c16.l(charAt, 32) > 0 && !k4b.W("\"(),/:;<=>?@[\\]{}", charAt)) {
                i++;
                i2 = i3;
            } else {
                StringBuilder o = a82.o("Header name '", str, "' contains illegal character '");
                o.append(str.charAt(i2));
                o.append("' (code ");
                throw new IllegalArgumentException(hl5.p(o, str.charAt(i2) & 255, ')'));
            }
        }
    }

    @Override // defpackage.c3e
    public final void N(String str) {
        str.getClass();
        List list = lg5.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (c16.l(charAt, 32) < 0 && charAt != '\t') {
                StringBuilder o = a82.o("Header value '", str, "' contains illegal character '");
                o.append(str.charAt(i2));
                o.append("' (code ");
                throw new IllegalArgumentException(hl5.p(o, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r45, i4b] */
    public final r45 Y() {
        Map map = (Map) this.a;
        map.getClass();
        return new i4b(map, true);
    }
}
