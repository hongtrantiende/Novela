package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ru3  reason: default package */
/* loaded from: classes3.dex */
public final class ru3 implements s76 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public ru3(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.b = enumArr;
        this.c = new mfb(new u93(7, this, str));
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Enum r5 = (Enum) obj;
                r5.getClass();
                Enum[] enumArr = (Enum[]) obj2;
                int r0 = b00.r0(r5, enumArr);
                if (r0 != -1) {
                    jbeVar.t(e(), r0);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String a = e().a();
                String arrays = Arrays.toString(enumArr);
                arrays.getClass();
                sb.append(" is not a valid enum ");
                sb.append(a);
                sb.append(", must be one of ");
                sb.append(arrays);
                throw new IllegalArgumentException(sb.toString());
            default:
                jbeVar.G((tla) obj2, ((dz7) obj).a);
                return;
        }
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int u = yq2Var.u(e());
                if (u >= 0 && u < enumArr.length) {
                    return enumArr[u];
                }
                String a = e().a();
                int length = enumArr.length;
                throw new IllegalArgumentException(u + " is not among valid " + a + " enum values, values size is " + length);
            default:
                return new dz7((ora) yq2Var.d((tla) obj));
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        switch (this.a) {
            case 0:
                return (o9a) ((mfb) this.c).getValue();
            default:
                return (snd) this.c;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + e().a() + '>';
            default:
                return super.toString();
        }
    }

    public ru3(s76 s76Var) {
        tla tlaVar = new tla(s76Var);
        this.b = tlaVar;
        this.c = aze.i("androidx.navigation3.runtime.NavBackStack", tlaVar.c);
    }
}
