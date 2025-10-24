SUMMARY = "RPMsg DMA shared library"
LICENSE = "TI-TFL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=91dc4ee6d125d0aaba4e5bd2fcc50ed3"

SRC_URI = "git://github.com/TexasInstruments/rpmsg-dma.git;protocol=https;branch=scarthgap"
SRCREV = "33d20a5a488844ace45ffb9dbbad9f043c5c897f"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "ti-rpmsg-char"

EXTRA_OECMAKE += "-DBUILD_LIB=ON -DBUILD_AUDIO_OFFLOAD_EXAMPLE=OFF -DBUILD_2DFFT_OFFLOAD_EXAMPLE=OFF"

COMPATIBLE_MACHINE = "^(k3)$"
