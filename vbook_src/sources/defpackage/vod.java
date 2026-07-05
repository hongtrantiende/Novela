package defpackage;

import java.util.ArrayList;
import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vod  reason: default package */
/* loaded from: classes3.dex */
public final class vod extends sod {
    public final ood[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vod(yod yodVar, String str, String str2, String str3, ood[] oodVarArr, c26 c26Var, ArrayList arrayList) {
        super(yodVar, str, str2, str3);
        c26Var.getClass();
        this.e = oodVarArr;
        new vla(arrayList);
    }

    @Override // defpackage.xod
    public final EventType a() {
        return EventType.START_ELEMENT;
    }

    @Override // defpackage.sod
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(EventType.START_ELEMENT);
        sb.append(" - {");
        sb.append(this.b);
        sb.append('}');
        sb.append(this.d);
        sb.append(':');
        sb.append(this.c);
        sb.append(" (");
        sb.append(this.a);
        sb.append(')');
        ood[] oodVarArr = this.e;
        if (oodVarArr.length == 0) {
            str = "";
        } else {
            str = "\n    ";
        }
        sb.append(b00.s0(oodVarArr, "\n    ", str, null, new x8d(20), 28));
        return sb.toString();
    }
}
