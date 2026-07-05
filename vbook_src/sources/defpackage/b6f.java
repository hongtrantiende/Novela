package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b6f  reason: default package */
/* loaded from: classes.dex */
public final class b6f {
    public static final hlf b = hlf.a(new byte[0]);
    public final HashMap a;

    public b6f(HashMap hashMap) {
        this.a = hashMap;
    }

    public final Iterable a(byte[] bArr) {
        List list;
        hlf hlfVar = b;
        HashMap hashMap = this.a;
        List list2 = (List) hashMap.get(hlfVar);
        int i = 5;
        if (bArr.length >= 5) {
            if (5 > bArr.length) {
                i = bArr.length;
            }
            list = (List) hashMap.get(new hlf(bArr, i));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        if (list == null) {
            return list2;
        }
        return new dxa(this, list, list2);
    }
}
