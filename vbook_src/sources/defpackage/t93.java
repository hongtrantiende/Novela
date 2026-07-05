package defpackage;

import android.graphics.pdf.PdfRenderer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t93  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t93 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t93(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return jye.u(Integer.valueOf(i2), (Integer) obj);
            case 1:
                qg6 qg6Var = (qg6) obj;
                fg6 fg6Var = (fg6) sl1.k0(qg6Var.j().m);
                if (fg6Var == null || fg6Var.a >= (qg6Var.j().p - 1) - i2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                cyb cybVar = (cyb) obj;
                if (cybVar.d() != p7a.a && i2 >= cybVar.c().a && i2 <= cybVar.b().a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                j2c j2cVar = (j2c) obj;
                if (j2cVar.a && i2 == j2cVar.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return new iw2(i2, nae.e, (vt4) obj);
            case 5:
                PdfRenderer.Page openPage = ((PdfRenderer) ((jp8) obj).c).openPage(i2);
                openPage.getClass();
                return new lq8(openPage);
            case 6:
                PdfRenderer.Page openPage2 = ((uq8) obj).b.openPage(i2);
                openPage2.getClass();
                return new mq8(openPage2);
            case 7:
                return Integer.valueOf(((z5a) obj).f.b.d(i2));
            case 8:
                return jye.u(Integer.valueOf(i2), (String) obj);
            case 9:
                ((trb) obj).N1(i2);
                return Boolean.TRUE;
            default:
                z8c z8cVar = (z8c) obj;
                StringBuilder sb = new StringBuilder("TileManager. init. imageSize=");
                sb.append(eh.C(z8cVar.e.a));
                sb.append(", contentSize=");
                sb.append(eh.C(z8cVar.f));
                sb.append(", preferredTileSize=");
                sb.append(eh.C(z8cVar.g));
                sb.append(", maxSampleSize=");
                sb.append(i2);
                sb.append(", sortedTileGridMap=");
                sb.append(ase.A(z8cVar.s));
                sb.append(". '");
                return rs8.h(z8cVar.b, sb, '\'');
        }
    }

    public /* synthetic */ t93(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
