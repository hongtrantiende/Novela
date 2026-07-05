package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptMsgData extends JavaScriptMsgData {
    private final Double adBreakDuration;
    private final String adBreakTime;
    private final List<Float> adCuePoints;
    private final AdData adData;
    private final Double adPeriodDuration;
    private final AdPodInfoData adPodInfo;
    private final Integer adPosition;
    private final Double adsDuration;
    private final List<Long> adsDurationsMs;
    private final String attributionSrc;
    private final String audioMimeType;
    private final Double bufferedTime;
    private final String clickString;
    private final Map<String, CompanionData> companions;
    private final List<CuePointData> cuepoints;
    private final Double currentTime;
    private final Double duration;
    private final Integer errorCode;
    private final String errorMessage;
    private final String eventId;
    private final List<IconClickFallbackImageMsgData> iconClickFallbackImages;
    private final IconsViewData iconsView;
    private final String innerError;
    private final SortedSet<Float> internalCuePoints;
    private final String ln;
    private final JavaScriptMsgData.LogData logData;
    private final String m;
    private final Boolean monitorAppLifecycle;
    private final String n;
    private final NetworkRequestData networkRequest;
    private final PauseAdData pauseAdData;
    private final PauseAdHideData pauseAdHideData;
    private final String queryId;
    private final ResizeAndPositionVideoMsgData resizeAndPositionVideo;
    private final Double seekTime;
    private final SkipViewData skipView;
    private final Double slateDuration;
    private final String streamId;
    private final String streamUrl;
    private final List<HashMap<String, String>> subtitles;
    private final Integer totalAds;
    private final Double totalDuration;
    private final JavaScriptUiConfigData uiConfig;
    private final String url;
    private final String vastEvent;
    private final String videoMimeType;
    private final String videoUrl;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends JavaScriptMsgData.Builder {
        private Double adBreakDuration;
        private String adBreakTime;
        private List<Float> adCuePoints;
        private AdData adData;
        private Double adPeriodDuration;
        private AdPodInfoData adPodInfo;
        private Integer adPosition;
        private Double adsDuration;
        private List<Long> adsDurationsMs;
        private String attributionSrc;
        private String audioMimeType;
        private Double bufferedTime;
        private String clickString;
        private Map<String, CompanionData> companions;
        private List<CuePointData> cuepoints;
        private Double currentTime;
        private Double duration;
        private Integer errorCode;
        private String errorMessage;
        private String eventId;
        private List<IconClickFallbackImageMsgData> iconClickFallbackImages;
        private IconsViewData iconsView;
        private String innerError;
        private SortedSet<Float> internalCuePoints;
        private String ln;
        private JavaScriptMsgData.LogData logData;
        private String m;
        private Boolean monitorAppLifecycle;
        private String n;
        private NetworkRequestData networkRequest;
        private PauseAdData pauseAdData;
        private PauseAdHideData pauseAdHideData;
        private String queryId;
        private ResizeAndPositionVideoMsgData resizeAndPositionVideo;
        private Double seekTime;
        private SkipViewData skipView;
        private Double slateDuration;
        private String streamId;
        private String streamUrl;
        private List<HashMap<String, String>> subtitles;
        private Integer totalAds;
        private Double totalDuration;
        private JavaScriptUiConfigData uiConfig;
        private String url;
        private String vastEvent;
        private String videoMimeType;
        private String videoUrl;

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData build() {
            return new AutoValue_JavaScriptMsgData(this.videoUrl, this.audioMimeType, this.videoMimeType, this.streamUrl, this.streamId, this.cuepoints, this.uiConfig, this.adData, this.adPodInfo, this.companions, this.pauseAdData, this.pauseAdHideData, this.resizeAndPositionVideo, this.clickString, this.logData, this.ln, this.n, this.m, this.errorCode, this.errorMessage, this.innerError, this.adCuePoints, this.internalCuePoints, this.bufferedTime, this.currentTime, this.duration, this.queryId, this.eventId, this.vastEvent, this.monitorAppLifecycle, this.adBreakTime, this.subtitles, this.totalAds, this.adPosition, this.adsDurationsMs, this.adBreakDuration, this.adPeriodDuration, this.adsDuration, this.totalDuration, this.slateDuration, this.networkRequest, this.url, this.attributionSrc, this.iconClickFallbackImages, this.iconsView, this.skipView, this.seekTime, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdBreakDuration(Double d) {
            this.adBreakDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdBreakTime(String str) {
            this.adBreakTime = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdCuePoints(List<Float> list) {
            this.adCuePoints = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdData(AdData adData) {
            this.adData = adData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdPeriodDuration(Double d) {
            this.adPeriodDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdPodInfo(AdPodInfoData adPodInfoData) {
            this.adPodInfo = adPodInfoData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdPosition(Integer num) {
            this.adPosition = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdsDuration(Double d) {
            this.adsDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdsDurationsMs(List<Long> list) {
            this.adsDurationsMs = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAttributionSrc(String str) {
            this.attributionSrc = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAudioMimeType(String str) {
            this.audioMimeType = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setBufferedTime(Double d) {
            this.bufferedTime = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setClickString(String str) {
            this.clickString = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setCompanions(Map<String, CompanionData> map) {
            this.companions = map;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setCuepoints(List<CuePointData> list) {
            this.cuepoints = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setCurrentTime(Double d) {
            this.currentTime = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setDuration(Double d) {
            this.duration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setErrorCode(Integer num) {
            this.errorCode = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setErrorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setEventId(String str) {
            this.eventId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setIconClickFallbackImages(List<IconClickFallbackImageMsgData> list) {
            this.iconClickFallbackImages = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setIconsView(IconsViewData iconsViewData) {
            this.iconsView = iconsViewData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setInnerError(String str) {
            this.innerError = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setInternalCuePoints(SortedSet<Float> sortedSet) {
            this.internalCuePoints = sortedSet;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setLn(String str) {
            this.ln = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setLogData(JavaScriptMsgData.LogData logData) {
            this.logData = logData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setM(String str) {
            this.m = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setMonitorAppLifecycle(Boolean bool) {
            this.monitorAppLifecycle = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setN(String str) {
            this.n = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setNetworkRequest(NetworkRequestData networkRequestData) {
            this.networkRequest = networkRequestData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setPauseAdData(PauseAdData pauseAdData) {
            this.pauseAdData = pauseAdData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setPauseAdHideData(PauseAdHideData pauseAdHideData) {
            this.pauseAdHideData = pauseAdHideData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setQueryId(String str) {
            this.queryId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setResizeAndPositionVideo(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
            this.resizeAndPositionVideo = resizeAndPositionVideoMsgData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setSeekTime(Double d) {
            this.seekTime = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setSkipView(SkipViewData skipViewData) {
            this.skipView = skipViewData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setSlateDuration(Double d) {
            this.slateDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setStreamId(String str) {
            this.streamId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setStreamUrl(String str) {
            this.streamUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setSubtitles(List<HashMap<String, String>> list) {
            this.subtitles = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setTotalAds(Integer num) {
            this.totalAds = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setTotalDuration(Double d) {
            this.totalDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setUiConfig(JavaScriptUiConfigData javaScriptUiConfigData) {
            this.uiConfig = javaScriptUiConfigData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setVastEvent(String str) {
            this.vastEvent = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setVideoMimeType(String str) {
            this.videoMimeType = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setVideoUrl(String str) {
            this.videoUrl = str;
            return this;
        }
    }

    private AutoValue_JavaScriptMsgData(String str, String str2, String str3, String str4, String str5, List<CuePointData> list, JavaScriptUiConfigData javaScriptUiConfigData, AdData adData, AdPodInfoData adPodInfoData, Map<String, CompanionData> map, PauseAdData pauseAdData, PauseAdHideData pauseAdHideData, ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData, String str6, JavaScriptMsgData.LogData logData, String str7, String str8, String str9, Integer num, String str10, String str11, List<Float> list2, SortedSet<Float> sortedSet, Double d, Double d2, Double d3, String str12, String str13, String str14, Boolean bool, String str15, List<HashMap<String, String>> list3, Integer num2, Integer num3, List<Long> list4, Double d4, Double d5, Double d6, Double d7, Double d8, NetworkRequestData networkRequestData, String str16, String str17, List<IconClickFallbackImageMsgData> list5, IconsViewData iconsViewData, SkipViewData skipViewData, Double d9) {
        this.videoUrl = str;
        this.audioMimeType = str2;
        this.videoMimeType = str3;
        this.streamUrl = str4;
        this.streamId = str5;
        this.cuepoints = list;
        this.uiConfig = javaScriptUiConfigData;
        this.adData = adData;
        this.adPodInfo = adPodInfoData;
        this.companions = map;
        this.pauseAdData = pauseAdData;
        this.pauseAdHideData = pauseAdHideData;
        this.resizeAndPositionVideo = resizeAndPositionVideoMsgData;
        this.clickString = str6;
        this.logData = logData;
        this.ln = str7;
        this.n = str8;
        this.m = str9;
        this.errorCode = num;
        this.errorMessage = str10;
        this.innerError = str11;
        this.adCuePoints = list2;
        this.internalCuePoints = sortedSet;
        this.bufferedTime = d;
        this.currentTime = d2;
        this.duration = d3;
        this.queryId = str12;
        this.eventId = str13;
        this.vastEvent = str14;
        this.monitorAppLifecycle = bool;
        this.adBreakTime = str15;
        this.subtitles = list3;
        this.totalAds = num2;
        this.adPosition = num3;
        this.adsDurationsMs = list4;
        this.adBreakDuration = d4;
        this.adPeriodDuration = d5;
        this.adsDuration = d6;
        this.totalDuration = d7;
        this.slateDuration = d8;
        this.networkRequest = networkRequestData;
        this.url = str16;
        this.attributionSrc = str17;
        this.iconClickFallbackImages = list5;
        this.iconsView = iconsViewData;
        this.skipView = skipViewData;
        this.seekTime = d9;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double adBreakDuration() {
        return this.adBreakDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String adBreakTime() {
        return this.adBreakTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public List<Float> adCuePoints() {
        return this.adCuePoints;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public AdData adData() {
        return this.adData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double adPeriodDuration() {
        return this.adPeriodDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public AdPodInfoData adPodInfo() {
        return this.adPodInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Integer adPosition() {
        return this.adPosition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double adsDuration() {
        return this.adsDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public List<Long> adsDurationsMs() {
        return this.adsDurationsMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String attributionSrc() {
        return this.attributionSrc;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String audioMimeType() {
        return this.audioMimeType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double bufferedTime() {
        return this.bufferedTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String clickString() {
        return this.clickString;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Map<String, CompanionData> companions() {
        return this.companions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public List<CuePointData> cuepoints() {
        return this.cuepoints;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptMsgData) {
            JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) obj;
            String str = this.videoUrl;
            if (str != null ? str.equals(javaScriptMsgData.videoUrl()) : javaScriptMsgData.videoUrl() == null) {
                String str2 = this.audioMimeType;
                if (str2 != null ? str2.equals(javaScriptMsgData.audioMimeType()) : javaScriptMsgData.audioMimeType() == null) {
                    String str3 = this.videoMimeType;
                    if (str3 != null ? str3.equals(javaScriptMsgData.videoMimeType()) : javaScriptMsgData.videoMimeType() == null) {
                        String str4 = this.streamUrl;
                        if (str4 != null ? str4.equals(javaScriptMsgData.streamUrl()) : javaScriptMsgData.streamUrl() == null) {
                            String str5 = this.streamId;
                            if (str5 != null ? str5.equals(javaScriptMsgData.streamId()) : javaScriptMsgData.streamId() == null) {
                                List<CuePointData> list = this.cuepoints;
                                if (list != null ? list.equals(javaScriptMsgData.cuepoints()) : javaScriptMsgData.cuepoints() == null) {
                                    JavaScriptUiConfigData javaScriptUiConfigData = this.uiConfig;
                                    if (javaScriptUiConfigData != null ? javaScriptUiConfigData.equals(javaScriptMsgData.uiConfig()) : javaScriptMsgData.uiConfig() == null) {
                                        AdData adData = this.adData;
                                        if (adData != null ? adData.equals(javaScriptMsgData.adData()) : javaScriptMsgData.adData() == null) {
                                            AdPodInfoData adPodInfoData = this.adPodInfo;
                                            if (adPodInfoData != null ? adPodInfoData.equals(javaScriptMsgData.adPodInfo()) : javaScriptMsgData.adPodInfo() == null) {
                                                Map<String, CompanionData> map = this.companions;
                                                if (map != null ? map.equals(javaScriptMsgData.companions()) : javaScriptMsgData.companions() == null) {
                                                    PauseAdData pauseAdData = this.pauseAdData;
                                                    if (pauseAdData != null ? pauseAdData.equals(javaScriptMsgData.pauseAdData()) : javaScriptMsgData.pauseAdData() == null) {
                                                        PauseAdHideData pauseAdHideData = this.pauseAdHideData;
                                                        if (pauseAdHideData != null ? pauseAdHideData.equals(javaScriptMsgData.pauseAdHideData()) : javaScriptMsgData.pauseAdHideData() == null) {
                                                            ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = this.resizeAndPositionVideo;
                                                            if (resizeAndPositionVideoMsgData != null ? resizeAndPositionVideoMsgData.equals(javaScriptMsgData.resizeAndPositionVideo()) : javaScriptMsgData.resizeAndPositionVideo() == null) {
                                                                String str6 = this.clickString;
                                                                if (str6 != null ? str6.equals(javaScriptMsgData.clickString()) : javaScriptMsgData.clickString() == null) {
                                                                    JavaScriptMsgData.LogData logData = this.logData;
                                                                    if (logData != null ? logData.equals(javaScriptMsgData.logData()) : javaScriptMsgData.logData() == null) {
                                                                        String str7 = this.ln;
                                                                        if (str7 != null ? str7.equals(javaScriptMsgData.ln()) : javaScriptMsgData.ln() == null) {
                                                                            String str8 = this.n;
                                                                            if (str8 != null ? str8.equals(javaScriptMsgData.n()) : javaScriptMsgData.n() == null) {
                                                                                String str9 = this.m;
                                                                                if (str9 != null ? str9.equals(javaScriptMsgData.m()) : javaScriptMsgData.m() == null) {
                                                                                    Integer num = this.errorCode;
                                                                                    if (num != null ? num.equals(javaScriptMsgData.errorCode()) : javaScriptMsgData.errorCode() == null) {
                                                                                        String str10 = this.errorMessage;
                                                                                        if (str10 != null ? str10.equals(javaScriptMsgData.errorMessage()) : javaScriptMsgData.errorMessage() == null) {
                                                                                            String str11 = this.innerError;
                                                                                            if (str11 != null ? str11.equals(javaScriptMsgData.innerError()) : javaScriptMsgData.innerError() == null) {
                                                                                                List<Float> list2 = this.adCuePoints;
                                                                                                if (list2 != null ? list2.equals(javaScriptMsgData.adCuePoints()) : javaScriptMsgData.adCuePoints() == null) {
                                                                                                    SortedSet<Float> sortedSet = this.internalCuePoints;
                                                                                                    if (sortedSet != null ? sortedSet.equals(javaScriptMsgData.internalCuePoints()) : javaScriptMsgData.internalCuePoints() == null) {
                                                                                                        Double d = this.bufferedTime;
                                                                                                        if (d != null ? d.equals(javaScriptMsgData.bufferedTime()) : javaScriptMsgData.bufferedTime() == null) {
                                                                                                            Double d2 = this.currentTime;
                                                                                                            if (d2 != null ? d2.equals(javaScriptMsgData.currentTime()) : javaScriptMsgData.currentTime() == null) {
                                                                                                                Double d3 = this.duration;
                                                                                                                if (d3 != null ? d3.equals(javaScriptMsgData.duration()) : javaScriptMsgData.duration() == null) {
                                                                                                                    String str12 = this.queryId;
                                                                                                                    if (str12 != null ? str12.equals(javaScriptMsgData.queryId()) : javaScriptMsgData.queryId() == null) {
                                                                                                                        String str13 = this.eventId;
                                                                                                                        if (str13 != null ? str13.equals(javaScriptMsgData.eventId()) : javaScriptMsgData.eventId() == null) {
                                                                                                                            String str14 = this.vastEvent;
                                                                                                                            if (str14 != null ? str14.equals(javaScriptMsgData.vastEvent()) : javaScriptMsgData.vastEvent() == null) {
                                                                                                                                Boolean bool = this.monitorAppLifecycle;
                                                                                                                                if (bool != null ? bool.equals(javaScriptMsgData.monitorAppLifecycle()) : javaScriptMsgData.monitorAppLifecycle() == null) {
                                                                                                                                    String str15 = this.adBreakTime;
                                                                                                                                    if (str15 != null ? str15.equals(javaScriptMsgData.adBreakTime()) : javaScriptMsgData.adBreakTime() == null) {
                                                                                                                                        List<HashMap<String, String>> list3 = this.subtitles;
                                                                                                                                        if (list3 != null ? list3.equals(javaScriptMsgData.subtitles()) : javaScriptMsgData.subtitles() == null) {
                                                                                                                                            Integer num2 = this.totalAds;
                                                                                                                                            if (num2 != null ? num2.equals(javaScriptMsgData.totalAds()) : javaScriptMsgData.totalAds() == null) {
                                                                                                                                                Integer num3 = this.adPosition;
                                                                                                                                                if (num3 != null ? num3.equals(javaScriptMsgData.adPosition()) : javaScriptMsgData.adPosition() == null) {
                                                                                                                                                    List<Long> list4 = this.adsDurationsMs;
                                                                                                                                                    if (list4 != null ? list4.equals(javaScriptMsgData.adsDurationsMs()) : javaScriptMsgData.adsDurationsMs() == null) {
                                                                                                                                                        Double d4 = this.adBreakDuration;
                                                                                                                                                        if (d4 != null ? d4.equals(javaScriptMsgData.adBreakDuration()) : javaScriptMsgData.adBreakDuration() == null) {
                                                                                                                                                            Double d5 = this.adPeriodDuration;
                                                                                                                                                            if (d5 != null ? d5.equals(javaScriptMsgData.adPeriodDuration()) : javaScriptMsgData.adPeriodDuration() == null) {
                                                                                                                                                                Double d6 = this.adsDuration;
                                                                                                                                                                if (d6 != null ? d6.equals(javaScriptMsgData.adsDuration()) : javaScriptMsgData.adsDuration() == null) {
                                                                                                                                                                    Double d7 = this.totalDuration;
                                                                                                                                                                    if (d7 != null ? d7.equals(javaScriptMsgData.totalDuration()) : javaScriptMsgData.totalDuration() == null) {
                                                                                                                                                                        Double d8 = this.slateDuration;
                                                                                                                                                                        if (d8 != null ? d8.equals(javaScriptMsgData.slateDuration()) : javaScriptMsgData.slateDuration() == null) {
                                                                                                                                                                            NetworkRequestData networkRequestData = this.networkRequest;
                                                                                                                                                                            if (networkRequestData != null ? networkRequestData.equals(javaScriptMsgData.networkRequest()) : javaScriptMsgData.networkRequest() == null) {
                                                                                                                                                                                String str16 = this.url;
                                                                                                                                                                                if (str16 != null ? str16.equals(javaScriptMsgData.url()) : javaScriptMsgData.url() == null) {
                                                                                                                                                                                    String str17 = this.attributionSrc;
                                                                                                                                                                                    if (str17 != null ? str17.equals(javaScriptMsgData.attributionSrc()) : javaScriptMsgData.attributionSrc() == null) {
                                                                                                                                                                                        List<IconClickFallbackImageMsgData> list5 = this.iconClickFallbackImages;
                                                                                                                                                                                        if (list5 != null ? list5.equals(javaScriptMsgData.iconClickFallbackImages()) : javaScriptMsgData.iconClickFallbackImages() == null) {
                                                                                                                                                                                            IconsViewData iconsViewData = this.iconsView;
                                                                                                                                                                                            if (iconsViewData != null ? iconsViewData.equals(javaScriptMsgData.iconsView()) : javaScriptMsgData.iconsView() == null) {
                                                                                                                                                                                                SkipViewData skipViewData = this.skipView;
                                                                                                                                                                                                if (skipViewData != null ? skipViewData.equals(javaScriptMsgData.skipView()) : javaScriptMsgData.skipView() == null) {
                                                                                                                                                                                                    Double d9 = this.seekTime;
                                                                                                                                                                                                    if (d9 != null ? d9.equals(javaScriptMsgData.seekTime()) : javaScriptMsgData.seekTime() == null) {
                                                                                                                                                                                                        return true;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Integer errorCode() {
        return this.errorCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String errorMessage() {
        return this.errorMessage;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        String str = this.videoUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.audioMimeType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.videoMimeType;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str4 = this.streamUrl;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str5 = this.streamId;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        List<CuePointData> list = this.cuepoints;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        JavaScriptUiConfigData javaScriptUiConfigData = this.uiConfig;
        if (javaScriptUiConfigData == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = javaScriptUiConfigData.hashCode();
        }
        int i7 = (i6 ^ hashCode7) * 1000003;
        AdData adData = this.adData;
        if (adData == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = adData.hashCode();
        }
        int i8 = (i7 ^ hashCode8) * 1000003;
        AdPodInfoData adPodInfoData = this.adPodInfo;
        if (adPodInfoData == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = adPodInfoData.hashCode();
        }
        int i9 = (i8 ^ hashCode9) * 1000003;
        Map<String, CompanionData> map = this.companions;
        if (map == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map.hashCode();
        }
        int i10 = (i9 ^ hashCode10) * 1000003;
        PauseAdData pauseAdData = this.pauseAdData;
        if (pauseAdData == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = pauseAdData.hashCode();
        }
        int i11 = (i10 ^ hashCode11) * 1000003;
        PauseAdHideData pauseAdHideData = this.pauseAdHideData;
        if (pauseAdHideData == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = pauseAdHideData.hashCode();
        }
        int i12 = (i11 ^ hashCode12) * 1000003;
        ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = this.resizeAndPositionVideo;
        if (resizeAndPositionVideoMsgData == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = resizeAndPositionVideoMsgData.hashCode();
        }
        int i13 = (i12 ^ hashCode13) * 1000003;
        String str6 = this.clickString;
        if (str6 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str6.hashCode();
        }
        int i14 = (i13 ^ hashCode14) * 1000003;
        JavaScriptMsgData.LogData logData = this.logData;
        if (logData == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = logData.hashCode();
        }
        int i15 = (i14 ^ hashCode15) * 1000003;
        String str7 = this.ln;
        if (str7 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str7.hashCode();
        }
        int i16 = (i15 ^ hashCode16) * 1000003;
        String str8 = this.n;
        if (str8 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str8.hashCode();
        }
        int i17 = (i16 ^ hashCode17) * 1000003;
        String str9 = this.m;
        if (str9 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str9.hashCode();
        }
        int i18 = (i17 ^ hashCode18) * 1000003;
        Integer num = this.errorCode;
        if (num == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = num.hashCode();
        }
        int i19 = (i18 ^ hashCode19) * 1000003;
        String str10 = this.errorMessage;
        if (str10 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str10.hashCode();
        }
        int i20 = (i19 ^ hashCode20) * 1000003;
        String str11 = this.innerError;
        if (str11 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str11.hashCode();
        }
        int i21 = (i20 ^ hashCode21) * 1000003;
        List<Float> list2 = this.adCuePoints;
        if (list2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = list2.hashCode();
        }
        int i22 = (i21 ^ hashCode22) * 1000003;
        SortedSet<Float> sortedSet = this.internalCuePoints;
        if (sortedSet == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = sortedSet.hashCode();
        }
        int i23 = (i22 ^ hashCode23) * 1000003;
        Double d = this.bufferedTime;
        if (d == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = d.hashCode();
        }
        int i24 = (i23 ^ hashCode24) * 1000003;
        Double d2 = this.currentTime;
        if (d2 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = d2.hashCode();
        }
        int i25 = (i24 ^ hashCode25) * 1000003;
        Double d3 = this.duration;
        if (d3 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = d3.hashCode();
        }
        int i26 = (i25 ^ hashCode26) * 1000003;
        String str12 = this.queryId;
        if (str12 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = str12.hashCode();
        }
        int i27 = (i26 ^ hashCode27) * 1000003;
        String str13 = this.eventId;
        if (str13 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = str13.hashCode();
        }
        int i28 = (i27 ^ hashCode28) * 1000003;
        String str14 = this.vastEvent;
        if (str14 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = str14.hashCode();
        }
        int i29 = (i28 ^ hashCode29) * 1000003;
        Boolean bool = this.monitorAppLifecycle;
        if (bool == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = bool.hashCode();
        }
        int i30 = (i29 ^ hashCode30) * 1000003;
        String str15 = this.adBreakTime;
        if (str15 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = str15.hashCode();
        }
        int i31 = (i30 ^ hashCode31) * 1000003;
        List<HashMap<String, String>> list3 = this.subtitles;
        if (list3 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = list3.hashCode();
        }
        int i32 = (i31 ^ hashCode32) * 1000003;
        Integer num2 = this.totalAds;
        if (num2 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = num2.hashCode();
        }
        int i33 = (i32 ^ hashCode33) * 1000003;
        Integer num3 = this.adPosition;
        if (num3 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = num3.hashCode();
        }
        int i34 = (i33 ^ hashCode34) * 1000003;
        List<Long> list4 = this.adsDurationsMs;
        if (list4 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = list4.hashCode();
        }
        int i35 = (i34 ^ hashCode35) * 1000003;
        Double d4 = this.adBreakDuration;
        if (d4 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = d4.hashCode();
        }
        int i36 = (i35 ^ hashCode36) * 1000003;
        Double d5 = this.adPeriodDuration;
        if (d5 == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = d5.hashCode();
        }
        int i37 = (i36 ^ hashCode37) * 1000003;
        Double d6 = this.adsDuration;
        if (d6 == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = d6.hashCode();
        }
        int i38 = (i37 ^ hashCode38) * 1000003;
        Double d7 = this.totalDuration;
        if (d7 == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = d7.hashCode();
        }
        int i39 = (i38 ^ hashCode39) * 1000003;
        Double d8 = this.slateDuration;
        if (d8 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = d8.hashCode();
        }
        int i40 = (i39 ^ hashCode40) * 1000003;
        NetworkRequestData networkRequestData = this.networkRequest;
        if (networkRequestData == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = networkRequestData.hashCode();
        }
        int i41 = (i40 ^ hashCode41) * 1000003;
        String str16 = this.url;
        if (str16 == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = str16.hashCode();
        }
        int i42 = (i41 ^ hashCode42) * 1000003;
        String str17 = this.attributionSrc;
        if (str17 == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = str17.hashCode();
        }
        int i43 = (i42 ^ hashCode43) * 1000003;
        List<IconClickFallbackImageMsgData> list5 = this.iconClickFallbackImages;
        if (list5 == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = list5.hashCode();
        }
        int i44 = (i43 ^ hashCode44) * 1000003;
        IconsViewData iconsViewData = this.iconsView;
        if (iconsViewData == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = iconsViewData.hashCode();
        }
        int i45 = (i44 ^ hashCode45) * 1000003;
        SkipViewData skipViewData = this.skipView;
        if (skipViewData == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = skipViewData.hashCode();
        }
        int i46 = (i45 ^ hashCode46) * 1000003;
        Double d9 = this.seekTime;
        if (d9 != null) {
            i = d9.hashCode();
        }
        return i46 ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public List<IconClickFallbackImageMsgData> iconClickFallbackImages() {
        return this.iconClickFallbackImages;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public IconsViewData iconsView() {
        return this.iconsView;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String innerError() {
        return this.innerError;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public SortedSet<Float> internalCuePoints() {
        return this.internalCuePoints;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String ln() {
        return this.ln;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public JavaScriptMsgData.LogData logData() {
        return this.logData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String m() {
        return this.m;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Boolean monitorAppLifecycle() {
        return this.monitorAppLifecycle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String n() {
        return this.n;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public NetworkRequestData networkRequest() {
        return this.networkRequest;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public PauseAdData pauseAdData() {
        return this.pauseAdData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public PauseAdHideData pauseAdHideData() {
        return this.pauseAdHideData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String queryId() {
        return this.queryId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public ResizeAndPositionVideoMsgData resizeAndPositionVideo() {
        return this.resizeAndPositionVideo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double seekTime() {
        return this.seekTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public SkipViewData skipView() {
        return this.skipView;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double slateDuration() {
        return this.slateDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String streamId() {
        return this.streamId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String streamUrl() {
        return this.streamUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public List<HashMap<String, String>> subtitles() {
        return this.subtitles;
    }

    public String toString() {
        String str = this.videoUrl;
        SkipViewData skipViewData = this.skipView;
        IconsViewData iconsViewData = this.iconsView;
        List<IconClickFallbackImageMsgData> list = this.iconClickFallbackImages;
        NetworkRequestData networkRequestData = this.networkRequest;
        List<Long> list2 = this.adsDurationsMs;
        List<HashMap<String, String>> list3 = this.subtitles;
        List<Float> list4 = this.adCuePoints;
        JavaScriptMsgData.LogData logData = this.logData;
        ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = this.resizeAndPositionVideo;
        PauseAdHideData pauseAdHideData = this.pauseAdHideData;
        PauseAdData pauseAdData = this.pauseAdData;
        Map<String, CompanionData> map = this.companions;
        AdPodInfoData adPodInfoData = this.adPodInfo;
        AdData adData = this.adData;
        JavaScriptUiConfigData javaScriptUiConfigData = this.uiConfig;
        String valueOf = String.valueOf(this.cuepoints);
        String valueOf2 = String.valueOf(javaScriptUiConfigData);
        String valueOf3 = String.valueOf(adData);
        String valueOf4 = String.valueOf(adPodInfoData);
        String valueOf5 = String.valueOf(map);
        String valueOf6 = String.valueOf(pauseAdData);
        String valueOf7 = String.valueOf(pauseAdHideData);
        String valueOf8 = String.valueOf(resizeAndPositionVideoMsgData);
        String valueOf9 = String.valueOf(logData);
        String valueOf10 = String.valueOf(list4);
        String valueOf11 = String.valueOf(this.internalCuePoints);
        String valueOf12 = String.valueOf(list3);
        String valueOf13 = String.valueOf(list2);
        String valueOf14 = String.valueOf(networkRequestData);
        String valueOf15 = String.valueOf(list);
        String valueOf16 = String.valueOf(iconsViewData);
        String valueOf17 = String.valueOf(skipViewData);
        int length = String.valueOf(str).length();
        String str2 = this.audioMimeType;
        int length2 = String.valueOf(str2).length();
        String str3 = this.videoMimeType;
        int length3 = String.valueOf(str3).length();
        String str4 = this.streamUrl;
        int length4 = String.valueOf(str4).length();
        String str5 = this.streamId;
        int length5 = String.valueOf(str5).length();
        int length6 = valueOf.length();
        Integer num = this.errorCode;
        String str6 = this.m;
        String str7 = this.n;
        String str8 = this.ln;
        String str9 = this.clickString;
        Double d = this.bufferedTime;
        Double d2 = this.currentTime;
        Double d3 = this.duration;
        String str10 = this.queryId;
        String str11 = this.eventId;
        String str12 = this.vastEvent;
        Boolean bool = this.monitorAppLifecycle;
        String str13 = this.adBreakTime;
        int a = s21.a(s21.a(s21.a(s21.a(length + 43 + length2 + 16 + length3 + 12 + length4 + 11 + length5 + 12 + length6 + 11 + valueOf2.length() + 9 + valueOf3.length() + 12, 13, valueOf4), 14, valueOf5), 18, valueOf6), 25, valueOf7);
        int length7 = valueOf8.length();
        int length8 = valueOf9.length() + s21.a(a + length7 + 14, 10, String.valueOf(str9));
        int length9 = String.valueOf(str8).length() + length8 + 5;
        int a2 = s21.a(length9 + 4 + String.valueOf(str7).length() + 4, 12, String.valueOf(str6));
        String str14 = this.innerError;
        String str15 = this.errorMessage;
        int length10 = String.valueOf(num).length() + a2;
        int length11 = String.valueOf(str15).length();
        int a3 = s21.a(s21.a(length10 + 15 + length11 + 13, 14, String.valueOf(str14)), 20, valueOf10);
        int length12 = valueOf11.length();
        int a4 = s21.a(a3 + length12 + 15 + String.valueOf(d).length() + 14, 11, String.valueOf(d2));
        int length13 = String.valueOf(d3).length();
        int length14 = String.valueOf(str12).length() + s21.a(a4 + length13 + 10 + String.valueOf(str10).length() + 10, 12, String.valueOf(str11));
        String valueOf18 = String.valueOf(bool);
        int i = length14 + 22;
        int length15 = valueOf18.length();
        Double d4 = this.seekTime;
        String str16 = this.attributionSrc;
        String str17 = this.url;
        Double d5 = this.slateDuration;
        Double d6 = this.totalDuration;
        Double d7 = this.adsDuration;
        Double d8 = this.adPeriodDuration;
        Double d9 = this.adBreakDuration;
        Integer num2 = this.adPosition;
        Integer num3 = this.totalAds;
        int a5 = s21.a(s21.a(i + length15 + 14, 12, String.valueOf(str13)), 11, valueOf12);
        int a6 = s21.a(s21.a(String.valueOf(num2).length() + String.valueOf(num3).length() + a5 + 13 + 17, 18, valueOf13) + String.valueOf(d9).length() + 19, 14, String.valueOf(d8));
        int length16 = String.valueOf(d6).length();
        int length17 = String.valueOf(d5).length();
        int length18 = valueOf14.length();
        StringBuilder sb = new StringBuilder(String.valueOf(d4).length() + s21.a(s21.a(s21.a(s21.a(length17 + length16 + String.valueOf(d7).length() + a6 + 16 + 16 + 17 + length18 + 6 + String.valueOf(str17).length() + 17, 26, String.valueOf(str16)), 12, valueOf15), 11, valueOf16), 11, valueOf17) + 1);
        nk2.C(sb, "JavaScriptMsgData{videoUrl=", str, ", audioMimeType=", str2);
        nk2.C(sb, ", videoMimeType=", str3, ", streamUrl=", str4);
        nk2.C(sb, ", streamId=", str5, ", cuepoints=", valueOf);
        nk2.C(sb, ", uiConfig=", valueOf2, ", adData=", valueOf3);
        nk2.C(sb, ", adPodInfo=", valueOf4, ", companions=", valueOf5);
        nk2.C(sb, ", pauseAdData=", valueOf6, ", pauseAdHideData=", valueOf7);
        nk2.C(sb, ", resizeAndPositionVideo=", valueOf8, ", clickString=", str9);
        nk2.C(sb, ", logData=", valueOf9, ", ln=", str8);
        nk2.C(sb, ", n=", str7, ", m=", str6);
        sb.append(", errorCode=");
        sb.append(num);
        sb.append(", errorMessage=");
        sb.append(str15);
        nk2.C(sb, ", innerError=", str14, ", adCuePoints=", valueOf10);
        sb.append(", internalCuePoints=");
        sb.append(valueOf11);
        sb.append(", bufferedTime=");
        sb.append(d);
        sb.append(", currentTime=");
        sb.append(d2);
        sb.append(", duration=");
        sb.append(d3);
        nk2.C(sb, ", queryId=", str10, ", eventId=", str11);
        sb.append(", vastEvent=");
        sb.append(str12);
        sb.append(", monitorAppLifecycle=");
        sb.append(bool);
        nk2.C(sb, ", adBreakTime=", str13, ", subtitles=", valueOf12);
        sb.append(", totalAds=");
        sb.append(num3);
        sb.append(", adPosition=");
        sb.append(num2);
        sb.append(", adsDurationsMs=");
        sb.append(valueOf13);
        sb.append(", adBreakDuration=");
        sb.append(d9);
        sb.append(", adPeriodDuration=");
        sb.append(d8);
        sb.append(", adsDuration=");
        sb.append(d7);
        sb.append(", totalDuration=");
        sb.append(d6);
        sb.append(", slateDuration=");
        sb.append(d5);
        nk2.C(sb, ", networkRequest=", valueOf14, ", url=", str17);
        nk2.C(sb, ", attributionSrc=", str16, ", iconClickFallbackImages=", valueOf15);
        nk2.C(sb, ", iconsView=", valueOf16, ", skipView=", valueOf17);
        sb.append(", seekTime=");
        sb.append(d4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Integer totalAds() {
        return this.totalAds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public Double totalDuration() {
        return this.totalDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public JavaScriptUiConfigData uiConfig() {
        return this.uiConfig;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String vastEvent() {
        return this.vastEvent;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String videoMimeType() {
        return this.videoMimeType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    public String videoUrl() {
        return this.videoUrl;
    }

    public /* synthetic */ AutoValue_JavaScriptMsgData(String str, String str2, String str3, String str4, String str5, List list, JavaScriptUiConfigData javaScriptUiConfigData, AdData adData, AdPodInfoData adPodInfoData, Map map, PauseAdData pauseAdData, PauseAdHideData pauseAdHideData, ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData, String str6, JavaScriptMsgData.LogData logData, String str7, String str8, String str9, Integer num, String str10, String str11, List list2, SortedSet sortedSet, Double d, Double d2, Double d3, String str12, String str13, String str14, Boolean bool, String str15, List list3, Integer num2, Integer num3, List list4, Double d4, Double d5, Double d6, Double d7, Double d8, NetworkRequestData networkRequestData, String str16, String str17, List list5, IconsViewData iconsViewData, SkipViewData skipViewData, Double d9, byte[] bArr) {
        this(str, str2, str3, str4, str5, list, javaScriptUiConfigData, adData, adPodInfoData, map, pauseAdData, pauseAdHideData, resizeAndPositionVideoMsgData, str6, logData, str7, str8, str9, num, str10, str11, list2, sortedSet, d, d2, d3, str12, str13, str14, bool, str15, list3, num2, num3, list4, d4, d5, d6, d7, d8, networkRequestData, str16, str17, list5, iconsViewData, skipViewData, d9);
    }
}
