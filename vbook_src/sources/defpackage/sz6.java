package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sz6  reason: default package */
/* loaded from: classes3.dex */
public final class sz6 extends c1 implements z6c {
    public static final cne c = new cne(28);
    public final Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz6() {
        super(c);
        if (hxe.m() != null) {
            Map k = hxe.m().k();
            this.b = k;
            return;
        }
        vs.k("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        throw null;
    }

    @Override // defpackage.z6c
    public final void N0(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            if (hxe.m() != null) {
                hxe.m().clear();
            } else {
                vs.k("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            }
        } else if (hxe.m() != null) {
            hxe.m().e(map);
        } else {
            vs.k("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }

    @Override // defpackage.z6c
    public final Object p0() {
        if (hxe.m() != null) {
            Map k = hxe.m().k();
            Map map = this.b;
            if (map == null) {
                if (hxe.m() != null) {
                    hxe.m().clear();
                    return k;
                }
                vs.k("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                return null;
            } else if (hxe.m() != null) {
                hxe.m().e(map);
                return k;
            } else {
                vs.k("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                return null;
            }
        }
        vs.k("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        return null;
    }
}
