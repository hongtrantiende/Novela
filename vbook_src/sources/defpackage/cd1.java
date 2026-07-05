package defpackage;

import android.os.Build;
import java.lang.annotation.Annotation;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd1 implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ cd1(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        boolean z;
        int a;
        switch (this.a) {
            case 0:
                return dd1.a("ISO-8859-1");
            case 1:
                return dd1.a("UTF-16");
            case 2:
                return dd1.a("UTF-32");
            case 3:
                return yae.z(Boolean.FALSE);
            case 4:
                return yae.z(new jub((String) null, 0L, 7));
            case 5:
                return new i11(false);
            case 6:
                tza tzaVar = rm1.a;
                return Boolean.TRUE;
            case 7:
                return new pq9("drawable:flip_hor", fca.B(new cr9(rs3.a, "composeResources/krop.library.ui.generated.resources/drawable/flip_hor.xml", -1L, -1L)));
            case 8:
                return new pq9("drawable:flip_ver", fca.B(new cr9(rs3.a, "composeResources/krop.library.ui.generated.resources/drawable/flip_ver.xml", -1L, -1L)));
            case 9:
                return new pq9("drawable:resize", fca.B(new cr9(rs3.a, "composeResources/krop.library.ui.generated.resources/drawable/resize.xml", -1L, -1L)));
            case 10:
                return new pq9("drawable:restore", fca.B(new cr9(rs3.a, "composeResources/krop.library.ui.generated.resources/drawable/restore.xml", -1L, -1L)));
            case 11:
                return new pq9("drawable:rot_left", fca.B(new cr9(rs3.a, "composeResources/krop.library.ui.generated.resources/drawable/rot_left.xml", -1L, -1L)));
            case 12:
                return new pq9("drawable:rot_right", fca.B(new cr9(rs3.a, "composeResources/krop.library.ui.generated.resources/drawable/rot_right.xml", -1L, -1L)));
            case 13:
                return yae.z(Boolean.FALSE);
            case 14:
                return yae.z(Boolean.FALSE);
            case 15:
                return pvc.a;
            case 16:
                return new kz9((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
            case 17:
                return new ckc(y9e.j(nae.e, nae.e));
            case 18:
                tza tzaVar2 = tx1.a;
                return null;
            case 19:
                ex1.b("Unexpected call to default provider");
                throw new gt1(6);
            case 20:
                tza tzaVar3 = i62.a;
                return Boolean.FALSE;
            case 21:
                return new m78("com.reader.app.ui.screen.community.ConversationListRoute", n62.INSTANCE, new Annotation[0]);
            case 22:
                return new oh();
            case 23:
                int[][] iArr = new int[2];
                for (int i = 0; i < 2; i++) {
                    int[] iArr2 = new int[13];
                    int i2 = 0;
                    for (int i3 = 0; i3 < 13; i3++) {
                        if (i3 == 0) {
                            a = 0;
                        } else {
                            mfb mfbVar = u72.a;
                            if (i != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a = u72.a(i3, z);
                        }
                        i2 += a;
                        iArr2[i3] = i2;
                    }
                    iArr[i] = iArr2;
                }
                return iArr;
            case 24:
                return new m78("com.reader.app.ui.screen.community.CreateGroupConversationRoute", gb2.INSTANCE, new Annotation[0]);
            case 25:
                return yae.z(new jub((String) null, 0L, 7));
            case 26:
                return fd2.a(1023, null, null);
            case 27:
                return (ed2) fd2.a.getValue();
            case 28:
                String[] strArr = Build.SUPPORTED_ABIS;
                zy zyVar = zy.a;
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str != null) {
                            if (k4b.V(str, "arm64", false)) {
                                return zy.e;
                            }
                            if (k4b.V(str, "arm", false)) {
                                return zy.d;
                            }
                            if (k4b.V(str, "x86_64", false)) {
                                return zy.c;
                            }
                            if (k4b.V(str, "x86", false)) {
                                return zy.b;
                            }
                            if (k4b.V(str, "mips", false)) {
                                return zy.f;
                            }
                        }
                    }
                    System.out.println((Object) ("Undetected android architecture: " + b00.D0(strArr)));
                    return zyVar;
                }
                return zyVar;
            default:
                return new w3a("kotlinx.datetime.DateTimeUnit.DateBased", cm9.a(jj2.class), new gi1[]{cm9.a(lj2.class), cm9.a(nj2.class)}, new s76[]{xj2.a, br7.a});
        }
    }
}
